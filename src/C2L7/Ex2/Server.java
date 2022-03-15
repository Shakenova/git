package C2L7.Ex2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) {

        try{
            ServerSocket server = new ServerSocket(1989);
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            while((data = (PackageData) inStream.readObject())!=null){
                System.out.println(data);
                PackageData response = null;

                if(data.getMessage().toLowerCase().equals("hello") || data.getMessage().toLowerCase().equals("hi")){

                    response = new PackageData("Server","Hello!");

                }else if(data.getMessage().toLowerCase().equals("lol")){

                    response = new PackageData("Server","LOOOOL!");

                }
                outputStream.writeObject(response);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}