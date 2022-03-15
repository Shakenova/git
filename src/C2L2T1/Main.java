package C2L2T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum=0;

        User users[] = new User[5];

        for(int i=0; i<users.length;i++){
            User u = new User();
            u.name = in.next();
            u.surname = in.next();
            try {
                u.age=in.nextInt();
            }catch (Exception e){
                String temp = in.next();
                u.age=0;
            }

            users[i] = u;

        }
        for (int i=0; i<users.length;i++){
            sum = sum + users[i].age;
            users[i].getUserData();
        }
        System.out.println("avg age in array: "+sum/users.length);



    }
}
