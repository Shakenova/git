package C2L8T;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id){
        this.socket=socket;
        this.id=id;
    }
    public void run(){

        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            PackageData pd = null;
            while ((pd = (PackageData) inputStream.readObject())!= null){
                if(pd.getOperationType().equals("1")){
                    ArrayList<Book> books = readBook();
                    ArrayList<Book> copyBooks = (ArrayList<Book>) books.clone();
                    PackageData response = new PackageData("1",copyBooks, null);
                    System.out.println("Client#"+id+" requested list of books");
                    outputStream.writeObject(response);

                }else if(pd.getOperationType().equals("2")){
                    Book book =pd.getBook();
                    ArrayList<Book> books = readBook();
                    books.add(book);
                    ArrayList<Book> copyBooks = (ArrayList<Book>) books.clone();
                    System.out.println("Client#"+id+" added the book "+book.toString());
                    saveBook(copyBooks);

                }else if(pd.getOperationType().equals("0")){
                    PackageData response = new PackageData("0",null, null);
                    System.out.println("Client#"+id+" need to disconnect");
                    outputStream.writeObject(response);
                }else{
                    System.out.println("Client#"+id+"entered wrong command!");
                }
            }

        }catch (Exception e){
           // e.printStackTrace();
            System.out.println("Client#"+id+":Connection reset");
        }
    }
    public static void saveBook(ArrayList<Book> book){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("books.data"));
            outStream.writeObject(book);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList readBook(){
        ArrayList<Book> book = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("books.data"));
            book = (ArrayList)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return book;
    }
}
