package C2L8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;


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
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            while((data = (PackageData) inputStream.readObject())!=null){
                System.out.println(data);
                PackageData response = null;
                if(data.getMessage().toLowerCase().equals("hello") || data.getMessage().toLowerCase().equals("hi")){
                    response = new PackageData("Server","Hello!");
                }else if(data.getMessage().toLowerCase().equals("lol")){
                    response = new PackageData("Server","LOOOOL!");
                }
                outputStream.writeObject(response);
            }
        }catch (Exception e){

        }
    }
}