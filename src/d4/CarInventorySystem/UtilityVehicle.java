package d4.CarInventorySystem;

public class UtilityVehicle extends Car{

    boolean isFourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean isFourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }

    public String getInfo(){
        return "\nVIN Number: " + vinNumber + "\nMake: " + make + "\nModel: " + model +
                "\nMileage: " + mileage + "\nIsFourWheelDrive: " + isFourWheelDrive;
    }
}
