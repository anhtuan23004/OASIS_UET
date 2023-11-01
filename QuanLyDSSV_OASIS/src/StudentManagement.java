import java.util.ArrayList;

public class StudentManagement {

    private final Student[] students = new Student[100];
    public int len = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        // Returns true if s1 and s2 are in the same group, false otherwise
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Adds a new student to the students array.
     *
     * @param newStudent the student to add
     */
    public void addStudent(Student newStudent) {
        // Adds a new student to the students array
        students[len] = newStudent;
        len++;
    }

    /**
     * Returns a string containing a list of students grouped by their group names.
     * The string contains the name, ID, group, and email of each student, separated by a hyphen.
     * Students are listed under their respective group names in alphabetical order.
     * @return a string representation of the list of students grouped by their group names.
     */
    public String studentsByGroup() {
        // Returns a string containing a list of students grouped by their group names

        String studentList = "";
        ArrayList<String> groups = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            Student currentStudent = students[i];
            if (!groups.contains(currentStudent.getGroup())) {
                groups.add(currentStudent.getGroup());
            }
        }

        for (String group : groups) {
            studentList += group + "\n";
            for (int i = 0; i < len; i++) {
                Student currentStudent = students[i];
                if (currentStudent.getGroup().equals(group)) {
                    studentList += currentStudent.getInfo() + "\n";
                }
            }
        }
        return studentList;
    }

    /**
     * Removes a student from the students array by their ID.
     * @param id the ID of the student to remove
     */
    public void removeStudent(String id) {
        // Removes a student from the students array by their id
        for (int i = 0; i < len; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < len - 1; j++) {
                    students[j] = students[j + 1];
                }
                len--;
                break;
            }
        }
    }
        public static void main(String[] args) {
        //Student a = new Student("Nguyen Van An", "1702001", "17020001@vnu.edu.vn");
        Student a = new Student("Nguyen Van An", "1702001", "K62CC", "17020001@vnu.edu.vn");
        System.out.println(a.getInfo());

        Student b = new Student(a);
        System.out.println(b.getInfo());

        Student c = new Student();
        System.out.println(c.getInfo());

        StudentManagement st1 = new StudentManagement();

        st1.addStudent(a);
        st1.addStudent(b);
        st1.addStudent(c);
        System.out.println(st1.studentsByGroup());
        st1.removeStudent("1702001");

        System.out.println(st1.studentsByGroup());

    }
}