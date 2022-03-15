package FinalProject;

import Lesson1.MainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class KassirAppl extends JFrame {
    private PackageData pd = new PackageData();
    private JButton ins;
    private JButton upd;
    private JButton del;
    private JButton back;
    private ArrayList<String> flightsName ;
    private ArrayList<Tickets> tickets;
    private DefaultTableModel tableModel;
    private JTable table;
    private Object[] header = new String[]{"id", "Flight_id", "Name", "Surname", "Passport#", "TicketType"};

    KassirAppl(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        while (true){
            System.out.println("check");
            if(getMessage().getTickets().size()>0){
                tickets=getMessage().getTickets();
                Object[][] array = new Object[tickets.size()][6];
                for (int i = 0; i < tickets.size(); i++) {
                    array[i][0] = tickets.get(i).getId();
                    array[i][1] = tickets.get(i).getFlight_id();
                    array[i][2] = tickets.get(i).getName();
                    array[i][3] = tickets.get(i).getSurname();
                    array[i][4] = tickets.get(i).getPassport_number();
                    array[i][5] = tickets.get(i).getTicket_type();
                }
                tableModel = new DefaultTableModel(array, header);
                table=new JTable(tableModel);

                ins = new JButton("Insert");
                ins.setSize(80,30);
                ins.setLocation(20,220);
                add(ins);
                ins.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Номер выделенной строки
                        int idx = table.getSelectedRow();
                        // Вставка новой строки после выделенной
                        tableModel.insertRow(idx + 1, new String[]{"id", "Flight_id", "Name", "Surname", "Passport#", "TicketType"});
                        Object newRow=table.getEditingRow();
                    }
                });
                upd = new JButton("Update");
                upd.setSize(80,30);
                upd.setLocation(120,220);
                add(upd);

                del = new JButton("Delete");
                del.setSize(80,30);
                del.setLocation(220,220);
                add(del);



            }
        }

    }

    public void setMessage(PackageData dp){this.pd =pd;}
    public PackageData getMessage(){return pd;}



    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5555);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData pd = null;
            pd = new PackageData("LIST TICKETS", "KASSIR", null, null, null, null, null, null, null, null, null, null);
            while (true){
                if (pd.getOperationType() != null){
                    outputStream.writeObject(pd);
                    pd = (PackageData) inputStream.readObject();
                    if (pd != null) {
                        if (pd.getOperationType().equals("LIST TICKETS SEND")) {
                            System.out.println("Response: " + pd.getOperationType());
                            ArrayList<Tickets> tickets = pd.getTickets();
                            KassirAppl mainFrame = new KassirAppl();
                            mainFrame.setMessage(pd);
                            //System.out.println(mainFrame.getTickets());
                            //System.out.println(tickets);
                            ArrayList<String> flightsName = pd.getFlightsName();
                            System.out.println(flightsName);
                            //mainFrame.setFlightsName(flightsName);

                            mainFrame.setVisible(true);
                            //mainFrame.getListTicketsPage().generateTable(tickets);

                            //mainFrame.setMessage(new PackageData());
                            pd = null;
                            //System.exit(0);
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
            KassirAppl frame = new KassirAppl();
        //Обязательно вызываем метод setVisible(true), так как по дефолту окно невидно
        frame.setVisible(true);
    }

}
