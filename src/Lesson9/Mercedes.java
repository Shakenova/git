package Lesson9;

public class Mercedes extends Car{
    String classType;
    Mercedes(){}
    Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType){
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    @Override
    public void ride(){
        System.out.println(name+" "+model+" "+maxSpeed+" "+year+" "+volume+" "+classType+" Car is riding.");
    }
}
