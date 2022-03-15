package C2L8T2;



import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) {
        System.out.println("Waiting client");
        try{
            ServerSocket server = new ServerSocket(3333);
            int id = 0;
            while(true){
                Socket socket = server.accept();
                id++;
                System.out.println("Client #"+id+" connected");
                ClientHandler ch = new ClientHandler(socket,id);
                ch.start();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}