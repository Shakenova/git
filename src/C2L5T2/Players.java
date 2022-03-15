package C2L5T2;

import java.io.Serializable;

public class Players implements Serializable {
    private String nickName;
    private double rating;

    Players(){}
    Players(String nickName, double rating){
        this.nickName=nickName;
        this.rating=rating;
    }

    public void setNickName(String nickName){this.nickName=nickName;}
    public String getNickName(){return nickName;}

    public void setRating(double rating){this.nickName=nickName;}
    public double getRating(){return rating;}

    @Override
    public String toString(){
        return nickName+"-"+rating;
    }
}
