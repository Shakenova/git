package C2L4T1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO DELETE USERS");
            System.out.println("PRESS [4] TO EXIT");

            int n = in.nextInt();
            if (n==1){
                System.out.println("Enter ID:");
                int id=in.nextInt();
                System.out.println("Enter login:");
                String login = in.next();
                System.out.println("Enter password:");
                String password = in.next();

                User u = new User(id, login, password);
                ArrayList users = getUsersList();
                users.add(u);
                saveUsersList(users);

            }else if(n==2){
                ArrayList users = getUsersList();
                for (int i = 0; i<users.size(); i++) {
                    System.out.println((i+1) + ") "+users.get(i));
                }
            }else if(n==3){
                ArrayList users = getUsersList();
                for (int i = 0; i<users.size(); i++) {
                    System.out.println((i+1) + ") "+users.get(i));
                }

                System.out.println("Insert index of user to delete: ");
                int index = in.nextInt();
                users.remove(index-1);
                saveUsersList(users);
            }else if(n==4){
                System.exit(0);
            }else {
                System.out.println("Wrong command!!!");
            }
        }

    }

    public static void saveUsersList(ArrayList<User> users){
        try{

            BufferedWriter bw = new BufferedWriter(new FileWriter("memory.txt"));

            for (User u : users) {
                bw.write(u.getId()+"\n");
                bw.write(u.getLogin()+"\n");
                bw.write(u.getPassword()+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<User> getUsersList(){
        ArrayList<User> users = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("memory.txt"));
            String line = "";
            while((line = br.readLine())!=null){
               int l = Integer.parseInt(line);

                String login = br.readLine();
                String password = br.readLine();

                users.add(new User(l, login, password));
            }
        }catch (Exception e){

        }
        return users;


    }
}
