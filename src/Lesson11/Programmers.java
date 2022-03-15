package Lesson11;

public class Programmers implements Workers{
    private int id;
    private String nickName;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    Programmers(){}
    Programmers(int id, String nickName, int salary, int bonusSalary, double KPIValue){
        this.id=id;
        this.nickName=nickName;
        this.salary=salary;
        this.bonusSalary=bonusSalary;
        this.KPIValue = KPIValue;
    }

    public void setId(int id){this.id=id;}
    public int getId(){return id;}

    public void setNickName(String nickName){this.nickName=nickName;}
    public String getNickName(){return nickName;}

    public void setBonusSalary(int bonusSalary){this.bonusSalary=bonusSalary;}
    public double getBonusSalary(){return (double) bonusSalary;}

    public void setKPIValue(double KPIValue){this.KPIValue=KPIValue;}
    public double getKPIValue(){return KPIValue;}

    @Override
    public String getWorkerData(){
        return "ID is: "+getId()+"; Nick Name is:"+getNickName()+"; Bonus Salary is: "+getBonusSalary()+"; KPI is: "+getKPIValue()
                +"; Salary: "+getSalary();
    }
    @Override
    public  int getSalary(){
        return (int)((double)salary + ( getKPIValue() * getBonusSalary()));
    }
}
