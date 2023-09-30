package d4.CarInventorySystem;

public class Truck extends Car{
    double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String getInfo(){
        return "\nVIN Number: " + vinNumber + "\nMake: " + make + "\nModel: " + model +
                "\nMileage: " + mileage + "\nTowing Capacity: " + towingCapacity;
    }

}
