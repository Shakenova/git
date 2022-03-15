package C2L8T;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        System.out.println("Waiting client");
        try {
            ServerSocket server = new ServerSocket(1111);
            int id = 0;
            while (true){
                Socket socket = server.accept();
                id++;
                System.out.println("Client#"+id+" CONNECTED");
                ClientHandler ch = new ClientHandler(socket, id);
                ch.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
