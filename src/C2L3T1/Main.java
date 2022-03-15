package C2L3T1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Players> players = new ArrayList<>();
        int a=1;
        double sumPrice=0;
        int sumAge=0;

        while (a!=0){
            System.out.println("For enter player press 1");
            System.out.println("For exit press 0");
            a=in.nextInt();
            if(a==1){
                Players p = new Players();
                System.out.println("Enter name:");
                p.setName(in.next());
                System.out.println("Enter price:");
                p.setPrice(in.nextDouble());
                System.out.println("Enter age:");
                p.setAge(in.nextInt());
                players.add(p);

            }else{
                break;
            }
        }

        for (int i = 0; i< players.size(); i++){
           sumPrice += players.get(i).getPrice();
           sumAge += players.get(i).getAge();

        }

        System.out.println("Avg price is: "+sumPrice/players.size());
        System.out.println("Summ of age is:" + sumAge);
    }
}
