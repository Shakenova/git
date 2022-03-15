package C2L3T1;

public class Players {
    private String name;
    private double price;
    private int age;

    Players(){}
    Players(String name, double price, int age){
        this.name=name;
        this.price=price;
        this.age=age;
    }
    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setPrice(double price){this.price=price;}
    public double getPrice(){return price;}

    public void setAge(int age){this.age=age;}
    public int getAge(){return age;}
}

