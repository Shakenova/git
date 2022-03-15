package Lesson10;

import jdk.nashorn.internal.runtime.SharedPropertyMap;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERPSystem erps = new ERPSystem();
        int a = 1;
        int b = 0;
        int c = 1;
        int d = 0;

        while (a!=0){
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");
            a= in.nextInt();
            if(a==1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");
                b = in.nextInt();
                if(b==1){
                    Student s = new Student();
                    System.out.println("Login: ");
                    s.login = in.next();
                    System.out.println("Password: ");
                    s.password=in.next();
                    System.out.println("Name: ");
                    s.name=in.next();
                    System.out.println("Surname: ");
                    s.surname=in.next();
                    System.out.println("Group: ");
                    s.group=in.next();
                    System.out.println("GPA: ");
                    s.gpa=in.nextDouble();
                    erps.addUser(s);
                }else if(b==2) {
                    Teacher t = new Teacher();
                    System.out.println("Login: ");
                    t.login = in.next();
                    System.out.println("Password: ");
                    t.password=in.next();
                    System.out.println("Nick Name: ");
                    t.nickName=in.next();
                    System.out.println("Status: ");
                    t.status=in.next();
                    while (c!=0) {
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                        c = in.nextInt();
                        if(c==1){
                            System.out.println("Subject: ");
                            String subject = in.next();
                            t.addSubjects(subject);
                        }else if(c==0){
                            break;
                        }

                    }
                    erps.addUser(t);
                }

            }else if(a==2){
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");
                d = in.nextInt();
                if(d==1){
                    for (int i =0; i<erps.sizeOfUsers;i++){
                        if(erps.memory[i] instanceof Student){
                            erps.printUser(i);
                            System.out.println("-----------------------------------");
                        }
                    }
                }else if(d==2){
                    for (int i = 0; i < erps.sizeOfUsers; i++) {
                        if(erps.memory[i] instanceof Teacher){
                            erps.printUser(i);
                            System.out.println("-----------------------------------");
                        }
                    }
                }
            }else if(a==3){
                System.out.println("ENTER INDEX:");
                int index= in.nextInt();
                erps.printUser(index);
                System.out.println("-----------------------------------");
            }else if(a==0){
                break;
            }
        }
    }
}
