package BigProjectWithGUI;


import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private KassirAddTicket addTicket;
    private KassirListTickets listTickets;
    private KassirUpdTicket updTicket;
    private MainMenuKassir mainMenuPage;

    private PackageData pd = new PackageData();

    private ArrayList<Tickets> tickets;
    private ArrayList<ViewFlightsName> flightsName;
    private Tickets ticket;

    public MainFrame(){
//        this.flightsName=flightsName;
//        this.tickets=tickets;
        //this.ticket=ticket;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("KASSIRS APPLICATION");
        setSize(500, 350);
        setLayout(null);
        mainMenuPage = new MainMenuKassir(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        addTicket = new KassirAddTicket(this);
        addTicket.setVisible(false);
        add(addTicket);

        listTickets = new KassirListTickets(this);
        listTickets.setVisible(false);
        add(listTickets);

        updTicket = new KassirUpdTicket(this);
        updTicket.setVisible(false);
        add(updTicket);



    }

    public MainMenuKassir getMainMenuPage() {
        return mainMenuPage;
    }

    public KassirAddTicket getAddTicketPage() {
        return addTicket;
    }

    public KassirListTickets getListTicketsPage() {
        return listTickets;
    }

    public KassirUpdTicket getUpdTicketPage() {
        return updTicket;
    }

    public ArrayList<Tickets> getTickets() {

        return (tickets);
    }

    public void setTickets(ArrayList<Tickets> tickets) {
        this.tickets=tickets;
    }


    public void setMessage(PackageData pd){
        this.pd=pd;
    }
    public PackageData getMessage(){return pd;}

    public void setFlightsName(ArrayList<ViewFlightsName> flightsName){this.flightsName=flightsName;}
    public ArrayList<ViewFlightsName> getFlightsName(){return flightsName;}

    public void setTicket(Tickets ticket){this.ticket=ticket;}
    public Tickets getTicket(){return ticket;}

}
