public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    /**
     * dsfslkdflsdfl.
     * @param name the name of the person
     * @param age the age of the person
     * @param address the address of the person
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public int compareTo(Person other) {
        if (this.name.compareTo(other.getName()) == 0) {
            if (this.age == other.getAge()) {
                return this.address.compareTo(other.getAddress());
            } else {
                return Integer.compare(this.age, other.getAge());
            }
        }
        return this.name.compareTo(other.getName());
    }
}