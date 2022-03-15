package Lesson9;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;
    Car(){}
    Car(String name, String model, int maxSpeed, int year, double volume){
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }
    public void ride(){
        System.out.println(name+" "+model+" "+maxSpeed+" "+year+" "+volume+" Car is riding.");

    }
}
