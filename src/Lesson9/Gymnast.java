package Lesson9;

public class Gymnast extends Sportsman{
    int height;
    int weight;
    String style;

    Gymnast(String fullName, int age, String country, int height, int weight, String style){
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    public String play(){
        return fullName+" "+age+" "+country+" "+height+" "+weight+" "+style+" is playing.";
    }
}
