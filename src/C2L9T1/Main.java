package C2L9T1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();

        while(true){

            System.out.println("PRESS [1] TO ADD ITEMS");
            System.out.println("PRESS [2] TO LIST ITEMS");
            System.out.println("PRESS [3] TO DELETE ITEMS");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert price: ");
                double price = in.nextDouble();

                Items item = new Items(null, name, price);
                db.addItem(item);

            }else if(choice.equals("2")) {

                ArrayList<Items> items = db.getAllItems();

                for (Items itm : items) {
                    System.out.println(itm);
                }
            }else if(choice.equals("3")){
                System.out.println("Insert id: ");
                Long id = in.nextLong();
                db.deleteItem(id);


            }else if(choice.equals("0")){
                System.exit(0);
            }
        }
    }
}

