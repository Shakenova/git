package BigProjectWithGUI;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KassirAddTicket extends JPanel {
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
    private ArrayList<ViewFlightsName> flightsName;

    public KassirAddTicket(MainFrame parent){
        this.parent=parent;
        // flightsName=parent.getFlightsName();
        //System.out.println(flightsName);
        //System.exit(0);
        Object[] array = new Object[flightsName.size()];
        setSize(500,300);
        setLayout(null);

        label = new JLabel("FLIGHT ID:");
        label.setSize(100, 30);
        label.setLocation(50, 10);
        add(label);

        for(int i = 0; i < array.length; i++) {
            array[i] = flightsName.get(i).getFlightName();
        }
        flight = new JComboBox(array);
        flight.setSize(300, 30);
        flight.setLocation(120, 10);
        add(flight);

//        textFieldFlightId = new JTextField("");
//        textFieldFlightId.setSize(300,30);
//        textFieldFlightId.setLocation(120, 10);
//        add(textFieldFlightId);


        label = new JLabel("NAME:");
        label.setSize(100, 30);
        label.setLocation(70, 50);
        add(label);

        textFieldName = new JTextField("");
        textFieldName.setSize(300,30);
        textFieldName.setLocation(120, 50);
        add(textFieldName);

        label = new JLabel("SURNAME:");
        label.setSize(100, 30);
        label.setLocation(50,90);
        add(label);

        textFieldSurname = new JTextField("");
        textFieldSurname.setSize(300, 30);
        textFieldSurname.setLocation(120, 90);
        add(textFieldSurname);

        label = new JLabel("PASSPORT #: ");
        label.setSize(100, 30);
        label.setLocation(30,130);
        add(label);

        textFieldPassport = new JTextField("");
        textFieldPassport.setSize(300, 30);
        textFieldPassport.setLocation(120, 130);
        add(textFieldPassport);

        label = new JLabel("TICKET TYPE: ");
        label.setSize(100, 30);
        label.setLocation(30,170);
        add(label);

        textFieldTicket = new JTextField("");
        textFieldTicket.setSize(300, 30);
        textFieldTicket.setLocation(120, 170);
        add(textFieldTicket);


        buttonAdd = new JButton("ADD");
        buttonAdd.setSize(125,30);
        buttonAdd.setLocation(100, 220);
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textFieldName.getText()!= null &&
                        textFieldSurname.getText()!=null &&
                        textFieldPassport.getText()!=null &&
                        textFieldTicket.getText()!=null){
                    //Object f = (String) flight.getSelectedItem();
                    Long flight_id=null;
                    for(int i=0; i<flightsName.size();i++){
                        if(flightsName.get(i).getFlightName().equals(flight.getSelectedItem())){
                            flight_id= flightsName.get(i).getId();
                        }
                    }
                    Tickets ticket = new Tickets( null,flight_id, textFieldName.getText(),textFieldSurname.getText(),textFieldPassport.getText(),textFieldTicket.getText());
                    PackageData pd = new PackageData("ADD TICKET","KASSIR",null,null,null,null,null,null,null,ticket,null,null);
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
        buttonBack.setSize(125,30);
        buttonBack.setLocation(275, 220);
        add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getAddTicketPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }

    public void setFlightsName(ArrayList<ViewFlightsName> flightsName){this.flightsName=flightsName;}

}
