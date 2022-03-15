package Lesson9;

public class Toyota extends Car{
    String manufacturer;

    Toyota(){}
    Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer){
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }
    @Override
    public void ride(){
        System.out.println(name+" "+model+" "+maxSpeed+" "+year+" "+volume+" "+manufacturer+" Car is riding.");
    }
}

