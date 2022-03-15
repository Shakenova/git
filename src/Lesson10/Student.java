package Lesson10;

public class Student extends User{
    String name;
    String surname;
    String group;
    double gpa;

    Student(){}
    Student(int id, String login, String password, String name, String surname, String group, double gpa){
        super(id, login, password);
        this.name=name;
        this.surname=surname;
        this.group=group;
        this.gpa=gpa;
    }
    public void setName(String name){this.name=name;}
    public String getName(){return name;}
    public void setSurname(String surname){this.surname=surname;}
    public String getSurname(){return surname;}
    public void setGroup(String group){this.group=group;}
    public String getGroup(){return group;}
    public void setGpa(double gpa){this.gpa=gpa;}
    public double getGpa(){return gpa;}

    @Override
    public String getUserData(){
        return "Id is: "+getId()+"; Login is: "+getLogin()+"; Password is: "+getPassword()+"; Name is: "+getName()+
                "; Surname is: "+getSurname()+"; Group is: "+getGroup()+"; GPA is: "+getGpa();
    }

}
