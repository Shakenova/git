package C2L8T2;


import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        boolean checkAddr=false;
        boolean check = false;
//если закомментить строку где System.out.println() программа перестает работать
            while (checkAddr==false) {
                 checkAddr = mainFrame.getFillAddr();
                System.out.println("is exists address: "+checkAddr);
                if (checkAddr == true) {
                    System.out.println("try to connect");
                    try {
                        Socket socket = new Socket(mainFrame.getIp(), 3333);
                        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                        while (true) {//ждем сообщение
                            check = mainFrame.getFlag();
                            System.out.println("is exists message: "+check);
                            if (check == true) {
                                String message = mainFrame.getMessage();
                                System.out.println("mess is" + message);
                                PackageData pd = new PackageData(message);
                                //отправляем сообщение на сервер
                                outputStream.writeObject(pd);
                                mainFrame.setFlag(false);
                            }
                        }


                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }

    }
}