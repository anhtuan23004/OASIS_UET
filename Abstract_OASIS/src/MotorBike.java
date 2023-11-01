public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Construct.
     * @param brand the brand
     * @param model the model
     * @param registrationNumber the registration number
     * @param owner the owner
     * @param hasSideCar boolean indicating
     * @author <a href="maianhtuan"
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    /**
     * Ham lay du lieu motor.
     * @return string
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + getBrand() + "\n"
                + "\tModel: " + getModel() + "\n"
                + "\tRegistration Number: " + getRegistrationNumber() + "\n"
                + "\tHas Side Car: " + isHasSidecar() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - " + getOwner().getAddress();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSideCar) {
        this.hasSidecar = hasSideCar;
    }
}
