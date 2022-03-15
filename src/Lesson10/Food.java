package Lesson10;

public abstract class Food {
    String name;
    Food(){}
    Food(String name){
        this.name = name;
    }
    public abstract double getCalories();
}
