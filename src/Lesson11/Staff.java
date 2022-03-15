package Lesson11;

public class Staff implements Workers{
    private int id;
    private String name;
    private String surname;
    private int salary;

    Staff(){}
    Staff(int id, String name, String surname, int salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }

    public void setId(int id){this.id=id;}
    public int getId(){return id;}

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setSurname(String surname){this.surname=surname;}
    public String getSurname(){return surname;}

    public void setSalary(int salary){this.salary=salary;}

    @Override
    public String getWorkerData(){
        return "ID is: "+getId()+"; Name is: "+getName()+"; Surname is: "+getSurname()+"; Salary is: "+getSalary();
    }

    @Override
    public  int getSalary(){
        return salary;
    }
}
