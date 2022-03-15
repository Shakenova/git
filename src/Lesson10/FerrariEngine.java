package Lesson10;

public class FerrariEngine extends Engine{

    FerrariEngine(){}
    FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight){
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    public double efficiency(){
        return  0.25;
    }
    @Override
    public double throttleEnergy(){
        return getEngineVolume() * getCylinderAmount() * 100.0;
    }
    @Override
    public double breakEnergy(){
        return getEngineWeight() * 2;
    }
}
