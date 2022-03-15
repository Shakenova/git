package Aygerim.com;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    Player(){}
    Player(int number, String name, String surname, String position)
    {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;

    }
    public String toString(){
        return "number:"+number+" name:"+name+" surname:"+surname+" position:"+position;
    }
}
