package BigProjectWithGUI;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KassirListTickets extends JPanel {
    private MainFrame parent;
    private JLabel label;
    private JButton back;
//    private JButton ins;
//    private JButton del;
//    private JButton upd;


    private String header[] = {"id","Flight_id","Name","Surname","Passport#","TicketType"};

    private JTable table;
    private JTable table1;
    private JScrollPane scrollPane;


    public KassirListTickets(MainFrame parent){
        this.parent = parent;


        setSize(500,500);
        setLayout(null);

        label = new JLabel("LIST OF TICKETS:");
        label.setSize(300,30);
        label.setLocation(10,10);
        add(label);

//        ins = new JButton("Insert");
//        ins.setSize(80,30);
//        ins.setLocation(20,220);
//        add(ins);

        // Создание кнопки добавления строки таблицы
//        ins.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // Номер выделенной строки
//                int idx = table1.getSelectedRow();
//                // Вставка новой строки после выделенной
//                tableModel.insertRow(idx + 1, new String[] {"id","Flight_id","Name","Surname","Passport#","TicketType"});
//            }
//        });

//        upd = new JButton("Update");
//        upd.setSize(80,30);
//        upd.setLocation(120,220);
//        add(upd);
//
//        del = new JButton("Delete");
//        del.setSize(80,30);
//        del.setLocation(220,220);
//        add(del);

        back = new JButton("Back");
        back.setSize(80,30);
        back.setLocation(390,220);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //  parent.getAddStudentPage().setVisible(false);
                parent.getListTicketsPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });

        table = new JTable();
        table.setFont(new Font("Calibri", Font.PLAIN, 12));
        table.setRowHeight(30);



        scrollPane = new JScrollPane(table);
        scrollPane.setSize(460,150);
        scrollPane.setLocation(10,50);
        add(scrollPane);

        table1 = new JTable();
    }

    public void generateTable1(){

    }


    public void generateTable(ArrayList<Tickets> tickets){
        Object data[][] = new Object[tickets.size()][6];
        ArrayList<ViewFlightsName> viewFlightsNames = parent.getFlightsName();


        for(int i =0;i<tickets.size();i++){
            String view = null;
            for(int j=0; j<viewFlightsNames.size();j++) {

                if (viewFlightsNames.get(j).getId().equals(tickets.get(i).getFlight_id())) {
                    view = viewFlightsNames.get(j).getFlightName();
                }
            }
                data[i][0] = tickets.get(i).getId();
                data[i][1] = view;
                data[i][2] = tickets.get(i).getName();
                data[i][3] = tickets.get(i).getSurname();
                data[i][4] = tickets.get(i).getPassport_number();
                data[i][5] = tickets.get(i).getTicket_type();

        }



        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);

//        ArrayList<String> flightsName=parent.getFlightsName();
//        Object[] array = new Object[flightsName.size()];
//        for(int i = 0; i < array.length; i++) {
//            array[i] = flightsName.get(i);
//        }
//
//        System.out.println("flights:"+flightsName);
//        JComboBox<String> combo = new JComboBox<String>(array);
//        // Редактор ячейки с раскрывающимся списком
//        DefaultCellEditor editor = new DefaultCellEditor(combo);
//        // Определение редактора ячеек для колонки
//        table.getColumnModel().getColumn(1).setCellEditor(editor);

    }
}
