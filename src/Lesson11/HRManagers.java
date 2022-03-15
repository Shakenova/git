package Lesson11;

public class HRManagers implements Workers{
    private int id;
    private String fullName;
    private int salary;

    HRManagers(){}
    HRManagers(int id, String fullName, int salary){
        this.id=id;
        this.fullName=fullName;
        this.salary=salary;
    }

    public void setId(int id){this.id=id;}
    public int getId(){return id;}

    public void setFullName(String fullName){this.fullName=fullName;}
    public String getFullName(){return fullName;}

    @Override
    public String getWorkerData(){
        return "ID is: "+getId()+"; Full Name is: "+getFullName()+"; Salary is:"+getSalary();
    }
    @Override
    public  int getSalary(){
        return salary;
    }
}
