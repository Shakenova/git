package Lesson10;

public class Coke extends Food {
    double volumeLiters;
    boolean isSparkling;

    Coke() {
    }

    Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.isSparkling = isSparkling;
        this.volumeLiters = volumeLiters;
    }

    @Override
    public double getCalories(){
        double c = 0;
        if(isSparkling==true){
            c = volumeLiters * 400;
        }else{
            c = volumeLiters * 100;
        }
        return c;
    }
}