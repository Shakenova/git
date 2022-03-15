package Lesson9;

public class Sportsman {
    String fullName;
    int age;
    String country;

    Sportsman(){}
    Sportsman(String fullName, int age, String country){
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }
    public String play(){
        return fullName+" "+age+" "+country+" is playing.";
    }
}
