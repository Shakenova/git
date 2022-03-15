package C2L8T2;

import java.io.ObjectInputStream;
import java.net.Socket;


public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket,int id) {
        this.socket = socket;
        this.id = id;
    }

    public void run(){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            //ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            while((data = (PackageData) inputStream.readObject())!=null){
                System.out.println("Client#" +
                        id+": "+data.getMessage());
            }
        }catch (Exception e){

        }
    }
}