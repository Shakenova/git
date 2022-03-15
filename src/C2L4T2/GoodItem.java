package C2L4T2;

public class GoodItem {
    private String name;
    private int price;

    GoodItem(){}
    GoodItem(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name){ this.name=name;}
    public String getName(){return name;}

    public void setPrice(int price){ this.price=price;}
    public int getPrice(){return price;}

    @Override
    public String toString(){
        return name+" - "+price + " EUR";
    }
}
