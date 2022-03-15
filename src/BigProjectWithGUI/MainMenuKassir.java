package BigProjectWithGUI;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainMenuKassir extends JPanel{
    private MainFrame parent;
    private JButton add;
    private JButton list;
    private JButton update;
    private JButton exit;

    public MainMenuKassir(MainFrame parent){
        this.parent=parent;

        setSize(500, 400);
        setLayout(null);

        add= new JButton("ADD TICKET");
        add.setSize(300,30);
        add.setLocation(100,50);
        add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PackageData pd = new PackageData("PREPARE", "KASSIR", null, null, null, null, null, null, null, null, null, null);
                parent.setMessage(pd);
                parent.getMainMenuPage().setVisible(false);
                parent.getAddTicketPage().setVisible(true);
            }
        });

        list = new JButton("LIST TICKETS");
        list.setSize(300,30);
        list.setLocation(100,100);
        add(list);
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ArrayList<String> flightsName=new ArrayList<>();
                PackageData pd = new PackageData("LIST TICKETS","KASSIR",null, null, null,null,null,null,null,null,null,null);
                parent.setMessage(pd);
                parent.getMainMenuPage().setVisible(false);
                parent.getListTicketsPage().setVisible(true);
            }

        });

        update = new JButton("UPDATE TICKET");
        update.setSize(300,30);
        update.setLocation(100,150);
        add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PackageData pd = new PackageData("LIST TICKETS","KASSIR",null,null,null,null,null,null,null,null,null,null);
                parent.setMessage(pd);
                parent.getUpdTicketPage().setVisible(true);
                parent.getMainMenuPage().setVisible(false);
                parent.getListTicketsPage().setVisible(false);

            }
        });


        exit = new JButton("EXIT");
        exit.setSize(300,30);
        exit.setLocation(100,200);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

    }
}
