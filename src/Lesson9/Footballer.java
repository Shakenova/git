package Lesson9;

public class Footballer  extends Sportsman {
    String position;
    String club;

    Footballer(String fullName, int age, String country, String position, String club){
        super(fullName, age, country);
        this.position = position;
        this.club = club;

    }
    @Override
    public String play(){
        return fullName+" "+age+" "+country+" "+position+" "+club+" is playing.";
    }

}
