package FinalProject;


import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
//    private KassirAddTicket addTicket;
//    private KassirListFlights listFlights;
//    private KassirListTickets listTickets;
//    private MainMenuKassir mainMenuPage;

    private PackageData pd = new PackageData();

    private ArrayList<Tickets> tickets = new ArrayList<>();
    private ArrayList<String> flightsName= new ArrayList<>();

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENTS APPLICATION");
        setSize(500, 300);
        setLayout(null);
//        mainMenuPage = new MainMenuKassir(this);
//        mainMenuPage.setVisible(true);
//        add(mainMenuPage);
//
//        addTicket = new KassirAddTicket(this);
//        addTicket.setVisible(false);
//        add(addTicket);
//
//        listTickets = new KassirListTickets(this);
//        listTickets.setVisible(false);
//        add(listTickets);

    }

//    public MainMenuKassir getMainMenuPage() {
//        return mainMenuPage;
//    }
//
//    public KassirAddTicket getAddTicketPage() {
//        return addTicket;
//    }
//
//    public KassirListTickets getListTicketsPage() {
//        return listTickets;
//    }

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

    public void setFlightsName(ArrayList<String> flightsName){this.flightsName=flightsName;}
    public ArrayList<String> getFlightsName(){return flightsName;}

}
