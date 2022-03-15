package C2L5T1;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println("PRESS [0] TO EXIT");

            int n = in.nextInt();

            if (n == 1) {
                System.out.println("Name:");
                String name = in.next();
                System.out.println("Surname:");
                String surname = in.next();
                ArrayList<Subject> subjects = new ArrayList<>();

                while (true) {
                    System.out.println("PRESS [1] TO ADD SUBJECT");
                    System.out.println("PRESS [0] TO GO TO MAIN MENU");
                    int m = in.nextInt();
                    if (m == 1) {
                        System.out.println("Name:");
                        String subject = in.next();
                        System.out.println("Credits:");
                        int credits = in.nextInt();
                        Subject sbj = new Subject(subject, credits);
                        subjects.add(sbj);
                    }else if(m==0){
                        break;
                    }else{
                        System.out.println("Wrong command!!!");
                    }
                }

                Student std = new Student(name, surname, subjects);
                ArrayList students = readStudents();
                students.add(std);
                saveStudents(students);
            }else if(n==2){
                ArrayList students = readStudents();
                for(int i=0;  i<students.size();i++){
                    System.out.println(students.get(i).toString());
                }
            }else if(n==0){
                System.exit(0);
            }else{
                System.out.println("Wrong command!!!");
            }
        }
    }
        public static ArrayList readSubjects(){
            ArrayList subjects = new ArrayList<>();
            try{
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("subjects.data"));
                subjects = (ArrayList)inputStream.readObject();
                inputStream.close();
            }catch (Exception e){

            }
            return subjects;
        }

    public static void saveStudents(ArrayList students){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.data"));
            outStream.writeObject(students);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

        public static ArrayList readStudents(){
            ArrayList students = new ArrayList<>();
            try{
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.data"));
                students = (ArrayList)inputStream.readObject();
                inputStream.close();
            }catch (Exception e){

            }
            return students;
        }
}
