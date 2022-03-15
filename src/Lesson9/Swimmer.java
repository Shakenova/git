package Lesson9;

public class Swimmer extends Sportsman{
    String style;
    double recordTime;

    Swimmer(String fullName, int age, String country, String style, double recordTime){
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    @Override
    public String play(){
        return fullName+" "+age+" "+country+" "+style+" "+recordTime+" is playing.";
    }
}
