package C2L8T1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Insert your name");
      //  String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1",1002);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true) {
                System.out.println("PRESS 1 TO LIST BOOKS");
                System.out.println("PRESS 2 TO ADD BOOKS");
                System.out.println("PRESS 0 TO DISCONNECT FROM SERVER");
                String n = in.next();
                if (n.equals("1") ) {
                    ArrayList<Book> books=new ArrayList<>();
                    Book book=null;
                    PackageData pd = new PackageData("1", books, book);
                    PackageData data = null;
                    outputStream.writeObject(pd);
                    data = (PackageData) inputStream.readObject();
                    ArrayList<Book> booksin = data.getBooks();
                    for(int i=0; i<booksin.size();i++){
                        System.out.println(i+1+") "+books.get(i).toString());
                    }
                }else if(n.equals("2")){//не получается передать на сервер пакет с добавлением книги
                    System.out.println("Name:");
                    String bookName = in.next();
                    System.out.println("Author:");
                    String author = in.next();

                    Book bk = new Book(bookName, author);
                    ArrayList<Book> bks = new ArrayList<>();
                    bks.add(bk);

                    PackageData pd = new PackageData("2", bks, bk);

                    //System.out.println(pd.getBook().toString());

                    outputStream.writeObject(pd);
                    PackageData data = null;
                    if((data = (PackageData) inputStream.readObject())!=null){
                        System.out.println("book " + data.getBook().getName() + "is added");
                    }
                }else if(n.equals("0")){
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