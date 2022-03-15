package Lesson10;

public class CubeGold extends GoldShape{
    double side;

    CubeGold(){}
    CubeGold(double side){
        this.side = side;
    }
    @Override
    public double getVolume(){
        return Math.pow(side, 3);
    }
    @Override
    public double getPrice(){
        return getVolume() * 250 + 1200;
    }

}
