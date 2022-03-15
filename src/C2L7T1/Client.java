package C2L7T1;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = in.next();

        try{
            Socket socket = new Socket("localhost",1992);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            //ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true) {
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");
                int n = in.nextInt();
                if (n == 1) {
                    System.out.println("Insert message:");
                    String message = in.next();
                    MessageData pd = new  MessageData(name, message);
                    outputStream.writeObject(pd);
//                    if ((pd = ( MessageData) inputStream.readObject()) != null) {
//                        System.out.println(pd.getMessageText());
//                    }
                }else if(n==2){
                    System.exit(0);
                }else{
                    System.out.println("Wrong command!!!");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
