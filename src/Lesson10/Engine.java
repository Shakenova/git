package Lesson10;

public abstract class Engine {
    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    Engine(){}
    Engine(double engineVolume, int cylinderAmount, double engineWeight){
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }
    public void setEngineVolume(double engineVolume){ this.engineVolume = engineVolume;}
    public double getEngineVolume(){return engineVolume; }

    public void setCylinderAmount(int cylinderAmount){this.cylinderAmount = cylinderAmount;}
    public int getCylinderAmount(){return cylinderAmount;}

    public void setEngineWeight(double engineWeight){this.engineWeight = engineWeight; }
    public double getEngineWeight(){return engineWeight;}

    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();

    public double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
}
