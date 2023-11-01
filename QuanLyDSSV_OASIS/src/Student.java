public class Student {

    private String name;    // student's name
    private String id;      // student's ID
    private String group;   // student's group
    private String email;   // student's email

    /**
     Constructor that initializes a student object with the given parameters.
     *
     * @param name  the name of the student
     * @param id  the ID of the student
     * @param group  the group of the student
     * @param email  the email of the student
     */
    Student(String name, String id, String group, String email) {
        // constructor that initializes a student object with the given parameters
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    Student() {
        // default constructor that initializes a student object with default values
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Default constructor that initializes a student object with default values.
     * @param name the name of the student
     * @param id the ID of the student
     * @param email the email of the student
     */
    Student(String name, String id, String email) {
        // Set a default value for the group
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    /**
     * Constructor that creates a copy of a student object.
     * @param s  the student object to copy
     */
    public Student(Student s) {
        // constructor that creates a copy of a student object
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    String getInfo() {
        // gets a string representation of a student object
        return name + " - " + id + " - " + group + " - " + email;
    }

    public String getName() {
        // sets the name of a student
        return name;
    }

    public void setName(String name) {
        // sets the name of a student
        this.name = name;
    }

    public String getId() {
        // gets the id of a student
        return id;
    }

    public void setId(String id) {
        // sets the id of a student
        this.id = id;
    }

    public String getGroup() {
        // gets the group of a student
        return group;
    }

    public void setGroup(String group) {
        // sets the group of a student
        this.group = group;
    }

    public String getEmail() {
        // gets the email of a student
        return email;
    }

    public void setEmail(String email) {
        // sets the email of a student
        this.email = email;
    }
}