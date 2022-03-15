package Aygerim.com;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    Student(){}
    Student(String name, String surname, double gpa)
    {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public void setStudentData(){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData(){
        return name+", "+surname+", "+gpa;
    }
}
