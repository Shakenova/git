package C2L7.Ex1;
import java.net.*;
import java.io.*;

public class Server{
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(1989);
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            String message = "";
            while((message = (String)inStream.readObject())!=null){
                System.out.println(message);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}