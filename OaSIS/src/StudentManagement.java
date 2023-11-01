import java.util.ArrayList;
public class StudentManagement {
    private final Student[] students = new Student[100];

    public int size = 0;
    public Student[] getStudents() {
        return students;
    }
    public static boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }
    public void addStudent(Student newStudent)
    {
        students[size] = newStudent;
        size++;
    }
    public String studentsByGroup() {

        String studentList = "";
        ArrayList<String> groups = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Student currentStudent = students[i];
            if (!groups.contains(currentStudent.getGroup())) {
                groups.add(currentStudent.getGroup());
            }
        }
        for (String group : groups) {
            studentList += group + "\n";
            for (int i = 0; i < size; i++) {
                Student currentStudent = students[i];
                if (currentStudent.getGroup().equals(group)) {
                    studentList += currentStudent.getInfo() + "\n";
                }
            }
        }
        return studentList;
    }
    public void removeStudent(String id)
    {
        for(int i = 0; i < size; i++)
        {
            if(students[i].getId().equals(id)){
                for(int j = i; j < size - 1; j++)
                {
                    students[j] = students[j + 1];
                }
                size--;
                break;
            }
        }
    }
}
