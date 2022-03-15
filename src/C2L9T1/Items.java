package C2L9T1;

public class Items {
    private Long id;
    private String name;
    private double price;

    public Items(Long id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public long getId(){return  id;}

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setPrice(double price){this.price=price;}
    public double getPrice(){return price;}

    @Override
    public String toString(){
        return "id: "+id+"; name: "+name+"; price: "+price+";";
    }

}
