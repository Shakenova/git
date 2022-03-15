package C2L5;
import java.io.Serializable;

public class Player implements Serializable {

    private String name;
    private String club;
    private int price;

    public Player(String name, String club, int price) {
        this.name = name;
        this.club = club;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name+" - "+price + " EUR";
    }
}
