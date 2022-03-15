package C2L5T1;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private int credits;

    Subject(){}
    Subject(String name, int credits){
        this.name=name;
        this.credits=credits;
    }

    public void setName(String  name){this.name=name;}
    public String  getName(){return name;}

    public void setCredits(int credits){this.credits=credits;}
    public int getCredits(){return credits;}

    @Override
    public String toString() {
        return name+" - "+credits + " credit";
    }

}
