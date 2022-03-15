package Lesson10;

public class Burger extends Food{
    int meatAmount;
    int meatType;

    Burger(){}
    Burger(String name, int meatAmount, int meatType){
        super(name);
        this.meatAmount= meatAmount;
        this.meatType = meatType;
    }


    @Override
    public double getCalories(){
        double c =0;
        if(meatType==1){
            c= (double) meatAmount * 840;
        }else if(meatType==2){
            c= (double) meatAmount * 560;
        }
        return c;
    }
}
