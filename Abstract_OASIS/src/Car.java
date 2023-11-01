public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Construct.
     * @param brand the brand
     * @param model the model
     * @param registrationNumber the registration number
     * @param owner the owner
     * @param numberOfDoors the number of doors
     * @author <a href="maianhtuan"
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Ham tra ve du lieu Car.
     * @return String
     * @author <a href="maianhtuan"
     */
    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + getBrand() + "\n"
                + "\tModel: " + getModel() + "\n"
                + "\tRegistration Number: " + getRegistrationNumber() + "\n"
                + "\tNumber of Doors: " + getNumberOfDoors() + "\n"
                + "\tBelongs to " + getOwner().getName() + " - " + getOwner().getAddress();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
