package Lesson9;

public class OlympicGames extends Sportsman{
    String city;
    int year;
    Sportsman sportsmansList[];

    OlympicGames(String city, int year, Sportsman sportsmanList[]){
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmanList;
    }

}
