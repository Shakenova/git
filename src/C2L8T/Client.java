package C2L8T;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Book> b = new ArrayList<>();

        try{
            Socket socket = new Socket("localhost",1111);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true){
                System.out.println("PRESS 1 TO LIST BOOKS");
                System.out.println("PRESS 2 TO ADD BOOKS");
                System.out.println("PRESS 0 TO DISCONNECT FROM SERVER");
                String choice = in.next();
                if(choice.equals("1")){
                    PackageData pd = new PackageData(choice,null,null);
                    outputStream.writeObject(pd);

                    PackageData response = null;
                    if ((response = (PackageData) inputStream.readObject())!=null){
                        if(response.listOffBooks()!=null) {
                            ArrayList<Book> books = response.getBooks();
                            for(int i=0; i<books.size();i++){
                                System.out.println(books.get(i).toString());
                            }
                            System.out.println();
                        }else{
                            System.out.println("List is empty");
                        }
                    }


                }else if(choice.equals("2")){
                    System.out.println("Enter name:");
                    String name = in.next();
                    System.out.println("Enter author:");
                    String author = in.next();
                    Book book=new Book(name,author);
                    ArrayList<Book> books = new ArrayList<>();
                    books.add(book);
                    ArrayList<Book> copyBooks = (ArrayList<Book>) books.clone();
                    PackageData pd = new PackageData(choice,copyBooks,book);
                    outputStream.writeObject(pd);
                }else if(choice.equals("0")) {
                    PackageData pd = new PackageData(choice,null, null);
                    outputStream.writeObject(pd);
                    PackageData response = null;
                    if ((response = (PackageData) inputStream.readObject())!=null) {
                        System.exit(0);
                    }
                }else{
                    System.out.println("Wrong command!");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
