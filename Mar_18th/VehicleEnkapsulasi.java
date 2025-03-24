package Mar_18th;

public class VehicleEnkapsulasi {
    private double maxLoad;
    private double load;

    public VehicleEnkapsulasi(){

    }
    public VehicleEnkapsulasi(double maxLoad){ // Konstruktor
        this.maxLoad = maxLoad;
    }

    public void setMaxLoad(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }

    public  boolean addLoad(double weight){
        if (load+weight <= maxLoad) {
            this.load = this.load+weight;
            return true;
        } else {
            return false;
        }
    }
}
