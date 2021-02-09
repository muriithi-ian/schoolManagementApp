package SchoolManagement;

import java.util.List;

public class School {
    private String schoolName;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private List<Teacher> teachers;
    private List<Student> students;

    public School(String schoolName, List<Teacher> teachers, List<Student> students) {
        this.schoolName =schoolName;
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void updateMoneyEarned(int moneyEarned) {

        totalMoneyEarned += moneyEarned;
    }

    public static void updateMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);

    }
}
