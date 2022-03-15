package BigProjectWithGUI;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

        try {
            Socket socket = new Socket("localhost", 5555);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData pd = new PackageData("PREPARE", "KASSIR", null, null, null, null, null, null, null, null, null, null);
            outputStream.writeObject(pd);
           pd=(PackageData) inputStream.readObject();
           ArrayList<ViewFlightsName> flights = pd.getFlightsName();
           ArrayList<Tickets> tickets0 = pd.getTickets();
           mainFrame.getAddTicketPage().setFlightsName(flights);
           mainFrame.getUpdTicketPage().setTickets(tickets0);


            //Tickets ticket=new Tickets();
//            PackageData pd = new PackageData();
//            outputStream.writeObject(pd);
//            pd=(PackageData) inputStream.readObject();
//

            pd=null;
            while (true) {
                //endless();
                System.out.println("Waiting request");

                if((pd=mainFrame.getMessage()).getOperationType()!=null) {
                    System.out.println("Request: "+pd.getOperationType());
                    System.out.println(pd.getTicket());
                    outputStream.writeObject(pd);
                    pd = (PackageData) inputStream.readObject();
                    mainFrame.setMessage(pd);
                    if(pd!=null){
                        if(pd.getOperationType().equals("TICKET ADDED")){
                            System.out.println("Response: "+pd.getOperationType());
                            mainFrame.setTickets(pd.getTickets());
                            mainFrame.getUpdTicketPage().setTickets(pd.getTickets());
                            System.out.println(pd.getTickets());
                           // System.exit(0);
                            mainFrame.setMessage(new PackageData());
                            pd=null;
                        }else if(pd.getOperationType().equals("LIST TICKETS SEND")){
                            System.out.println("Response: "+pd.getOperationType());
                            ArrayList<Tickets> tickets=pd.getTickets();
                            mainFrame.setTickets(tickets);
                            System.out.println(mainFrame.getTickets());
                           // System.exit(0);
                            //System.out.println(tickets);
                            ArrayList<ViewFlightsName> flightsName=pd.getFlightsName();
                            System.out.println(flightsName);
                            mainFrame.setFlightsName(flightsName);

                            //mainFrame.getListTicketsPage().setVisible(true);
                            mainFrame.getListTicketsPage().generateTable(tickets);

                            mainFrame.setMessage(new PackageData());
                            pd=null;
                          //  System.exit(0);
                        }else if(pd.getOperationType().equals("TICKET SENT")){
                           System.out.println("TICKET SENT:"+pd.getTicket());
                            mainFrame.setTicket(pd.getTicket());
                            mainFrame.setMessage(new PackageData());
                            pd=null;
                        }else if(pd.getOperationType().equals("TICKET EDITED")){
                            mainFrame.setTickets(pd.getTickets());
                            mainFrame.setMessage(new PackageData());
                            pd=null;
                        }else if(pd.getOperationType().equals("PREPARE SEND")){
                            mainFrame.setTickets(pd.getTickets());
                            mainFrame.setFlightsName(pd.getFlightsName());
                            mainFrame.setMessage(new PackageData());
                            pd=null;
                        }
                    }
                    pd=null;
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static Boolean endless(){
        return true;
    }
}
