package Mar_18th;

public class Vehicle {
    public double load;
    public double maxLoad;

    public Vehicle(double maxLoad){ // Konstruktor
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
}
