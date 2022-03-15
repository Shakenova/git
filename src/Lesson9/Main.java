package Lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = 1;
       int b = 0;
       int c = 0;
       ArrayList<User> users = new ArrayList<>();


       while (a!=0){
          System.out.println("PRESS [1] ADD USER");
          System.out.println("PRESS [2] TO LIST USERS");
          System.out.println("PRESS [0] TO EXIT");
          a = in.nextInt();
          if (a == 1) {
             System.out.println("PRESS [1] TO ADD STUDENT");
             System.out.println("PRESS [2] TO ADD STAFF");
             b = in.nextInt();
             if(b==1){
                System.out.println("Insert name?");
                Student s = new Student();
                s.name = in.next();
                System.out.println("Insert surname?");
                s.surname = in.next();
                System.out.println("Insert ID?");
                s.id=in.nextInt();
                System.out.println("Insert Login?");
                s.login = in.next();
                System.out.println("Insert Password?");
                s.password = in.next();
                System.out.println("Insert GPA?");
                double gpa = in.nextDouble();
                 s.setGpa(gpa);
                System.out.println("Insert Course?");
                String course=new String("");
                course=in.next();
                s.addCourses(course);
                users.add(s);
                }else{
                System.out.println("Insert name?");
                Staff stf = new Staff();
                stf.name = in.next();
                System.out.println("Insert surname?");
                stf.surname = in.next();
                System.out.println("Insert ID?");
                stf.id=in.nextInt();
                System.out.println("Insert Login?");
                stf.login = in.next();
                System.out.println("Insert Password?");
                stf.password = in.next();
                System.out.println("Insert Salary?");
                double salary = in.nextDouble();
                stf.setSalary(salary);
                System.out.println("Insert Subject?");
                String subject=new String("");
                subject=in.next();
                stf.addSubjects(subject);
                users.add(stf);
             }

          }else if(a==2){
             System.out.println("PRESS [1] TO LIST STUDENTS");
             System.out.println("PRESS [2] TO LIST STAFF");
             c = in.nextInt();
             if(c==1){
                for (int i = 0; i < users.size(); i++) {
                   if(users.get(i) instanceof Student){
                     users.get(i).getData();
                   }
                }
             }else{
                for (int i = 0; i < users.size(); i++) {
                   if(users.get(i) instanceof Staff){
                      users.get(i).getData();
                   }
                }
             }

          }else{
             break;
          }

       }

    }
}




