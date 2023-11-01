import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * Construct.
     * @param name the name of the person
     * @param address the address of the person
     * @author <a href="maianhtuan"
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Ham them phuong tien.
     * @param vehicle the vehicle
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Ham xoa phuong tien.
     * @param registrationNumber the registration number
     */
    public void removeVehicle(String registrationNumber) {
        ListIterator<Vehicle> it = vehicleList.listIterator();
        for (ListIterator<Vehicle> iter = it; iter.hasNext();) {
            Vehicle vehicle = iter.next();
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                it.remove();
                return;
            }
        }
    }

    /**
     * Ham tra ve du lieu phuong tien.
     * @return list
     */
    public String getVehiclesInfo() {
        String list = name + " has:\n\n";
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            for (Vehicle vehicle : vehicleList) {
                list += vehicle.getInfo() + "\n";
            }
        }
        return list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
