import java.util.Objects;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student(String name, String id, String group, String email){
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo(){
        return name + " - " + id + " - " + group + " - " + email;
    }

    Student(){
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email  = "uet@vnu.edu.vn";
    }

    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}

