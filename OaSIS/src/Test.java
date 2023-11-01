public class Test {
    public static void main(String[] args) {
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
