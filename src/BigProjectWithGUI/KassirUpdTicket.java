package BigProjectWithGUI;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KassirUpdTicket extends JPanel {
    private MainFrame parent;

    private JLabel label;

    private JButton buttonAdd;
    private JButton buttonBack;

    private JTextField textFieldId;
    private JTextField textFieldFlightId;
    private JTextField textFieldPassport;
    private JTextField textFieldName;
    private JTextField textFieldSurname;
    private JTextField textFieldTicket;
    private JComboBox flight;
    private JComboBox ticketId;
    private ArrayList<Tickets> tickets;
    private ArrayList<ViewFlightsName> flightsName;


    public KassirUpdTicket(MainFrame parent) {
        this.parent = parent;
        //this.tickets = parent.getTickets();
        flightsName = parent.getFlightsName();
//        System.out.println("from upd page:"+tickets);
//        System.exit(0);

        Object[] ticketsId = new Object[tickets.size()];
        Object[] array = new Object[flightsName.size()];

        setSize(500, 400);
        setLayout(null);

        label = new JLabel("TICKET ID:");
        label.setSize(100, 30);
        label.setLocation(50, 10);
        add(label);


//        textFieldFlightId = new JTextField("");
//        textFieldFlightId.setSize(300,30);
//        textFieldFlightId.setLocation(120, 10);
//        add(textFieldFlightId);


        label = new JLabel("FLIGHT ID:");
        label.setSize(100, 30);
        label.setLocation(50, 50);
        add(label);

        for (int i = 0; i < ticketsId.length; i++) {
            ticketsId[i] = tickets.get(i).getId();
        }


        for (int i = 0; i < array.length; i++) {
            array[i] = flightsName.get(i).getFlightName();
        }
        flight = new JComboBox(array);
        flight.setSize(300, 30);
        flight.setLocation(120, 50);
        flight.setSelectedIndex(-1);

        add(flight);


        label = new JLabel("NAME:");
        label.setSize(100, 30);
        label.setLocation(70, 90);
        add(label);

        textFieldName = new JTextField("");
        textFieldName.setSize(300, 30);
        textFieldName.setLocation(120, 90);
        add(textFieldName);

        label = new JLabel("SURNAME:");
        label.setSize(100, 30);
        label.setLocation(50, 130);
        add(label);

        textFieldSurname = new JTextField("");
        textFieldSurname.setSize(300, 30);
        textFieldSurname.setLocation(120, 130);
        add(textFieldSurname);

        label = new JLabel("PASSPORT #: ");
        label.setSize(100, 30);
        label.setLocation(30, 170);
        add(label);

        textFieldPassport = new JTextField("");
        textFieldPassport.setSize(300, 30);
        textFieldPassport.setLocation(120, 170);
        add(textFieldPassport);

        label = new JLabel("TICKET TYPE: ");
        label.setSize(100, 30);
        label.setLocation(30, 210);
        add(label);

        textFieldTicket = new JTextField("");
        textFieldTicket.setSize(300, 30);
        textFieldTicket.setLocation(120, 210);
        add(textFieldTicket);

        ticketId = new JComboBox(ticketsId);
        ticketId.setSize(300, 30);
        ticketId.setLocation(120, 10);
        add(ticketId);
        ticketId.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        Tickets ticket = new Tickets();
                        for (int i = 0; i < tickets.size(); i++) {
                            if (tickets.get(i).getId().equals(ticketId.getSelectedItem())) {
                                ticket = (Tickets) tickets.get(i);
                            }
                        }
                        PackageData pd = new PackageData("GET_TICKET", "KASSIR", null, null, null, null, null, null, tickets, ticket, null, null);
                        parent.setTicket(ticket);
                        System.out.println("parent get tick:" + parent.getTicket());
                        parent.setMessage(pd);
                        int ind=3;
                        Object f= new Object();
                        for (int i=0; i<flightsName.size();i++){
                            if(flightsName.get(i).getId().equals(ticket.getFlight_id())){
                                ind=i;
                                f=flightsName.get(i).getFlightName();
                            }
                        }
                            System.out.println(ind);

                            //System.exit(0);
                            flight.setSelectedIndex(ind);
                            textFieldName.setText(ticket.getName());
                            textFieldSurname.setText(ticket.getSurname());
                            textFieldPassport.setText(ticket.getPassport_number());
                            textFieldTicket.setText(ticket.getTicket_type());
                    }
                }
        );


        buttonAdd = new JButton("UPDATE");
        buttonAdd.setSize(125,30);
        buttonAdd.setLocation(100, 250);
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textFieldName.getText()!= null &&
                        textFieldSurname.getText()!=null &&
                        textFieldPassport.getText()!=null &&
                        textFieldTicket.getText()!=null){
                    Long flight_id=null;
                    for(int i=0; i<flightsName.size();i++){
                        if(flightsName.get(i).getFlightName().equals(flight.getSelectedItem())){
                            flight_id= flightsName.get(i).getId();
                        }
                    }
                    Tickets ticket = new Tickets( (Long) ticketId.getSelectedItem(),flight_id, textFieldName.getText(),textFieldSurname.getText(),textFieldPassport.getText(),textFieldTicket.getText());
                    PackageData pd = new PackageData("EDIT TICKET","KASSIR",null,null,null,null,null,null,null,ticket,null,null);
                    parent.setMessage(pd);
                    textFieldPassport.setText("");
                    textFieldName.setText("");
                    textFieldSurname.setText("");
                    textFieldTicket.setText("");

                }
            }
        });

        add(buttonAdd);

        buttonBack = new JButton("BACK");
        buttonBack.setSize(125, 30);
        buttonBack.setLocation(275, 250);
        add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getUpdTicketPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }

    public void setTickets(ArrayList<Tickets> tickets){
        this.tickets=tickets;
    }
}


