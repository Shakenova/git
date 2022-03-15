package C2L8T1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;


public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    public void run(){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            while((data = (PackageData) inputStream.readObject()).getOperationType()!=null){
                System.out.println(data.getOperationType());
                PackageData response = null;
                if(data.getOperationType().equals("1") ){
                    ArrayList<Book> bk = readBook();
                    response = new PackageData("1", bk, null);
                }else if(data.getOperationType().equals("2")){
                    //System.out.println(data.getBook().toString());
                    ArrayList<Book> bk = readBook();
                    Book book = data.getBook();
                    bk.add(book);
                    saveBook(bk);
                    response = new PackageData("2", bk, book);
                }else{
                    System.out.println("wating command");
                }
                outputStream.writeObject(response);
            }
        }catch (Exception e){

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