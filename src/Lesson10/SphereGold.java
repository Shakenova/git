package Lesson10;

public class SphereGold extends GoldShape{
    double radius;
    SphereGold(){}
    SphereGold(double radius){
        this.radius = radius;
    }

    @Override
    public double getVolume(){
        return (3.0/4 * 3.14 * Math.pow(radius,3));
    }

    @Override
    public double getPrice(){
        return getVolume() * 250 + 1200;
    }
}
