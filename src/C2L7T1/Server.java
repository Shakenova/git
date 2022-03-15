package C2L7T1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Server {
    public static void main (String[] args) {
        try {
            ServerSocket server = new ServerSocket(1992);
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData data = null;
            while ((data = (MessageData) inStream.readObject()) != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                System.out.println("'"+data.getMessageText()+"' "+"from "+data.getUserName()+
                        " at "+dateFormat.format(data.getSentDate()));
//                PackageData response = null;
//                outputStream.writeObject(response);
            }
        } catch (IOException | ClassNotFoundException e) {
           // e.printStackTrace();
            System.out.println("Connection reset");
        }
    }
    }
