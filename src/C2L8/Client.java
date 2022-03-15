package C2L8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1",1989);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true){
                System.out.println("Insert message:");
                String message = in.next();
                PackageData pd = new PackageData(name,message);
                outputStream.writeObject(pd);
                if((pd = (PackageData) inputStream.readObject())!=null){
                    System.out.println(pd.getMessage());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}