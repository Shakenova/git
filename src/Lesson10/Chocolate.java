package Lesson10;

public class Chocolate extends Food {
    int weight;

    Chocolate(){}
    Chocolate(String name, int weight){
        super(name);
        this.weight = weight;
    }


    @Override
    public double getCalories(){
        return (double) weight * 740;
    }
}
