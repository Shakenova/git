package lesson22;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;


        User users[] = {new User(), new User(), new User(), new User(), new User()};

        for (int i = 0; i < users.length; i++) {

                try {
                    users[i].name = in.next();
                    users[i].surname = in.next();
                    users[i].age = in.nextInt();
                } catch (Exception e) {
                    String temp = in.next();
                    users[i].age = 0;
                }
                sum = sum + users[i].age;

            }
        for (int i=0; i<users.length; i++){
            users[i].getUserData();
        }

            System.out.println("avg age in array: " + sum / users.length);


        }
}
