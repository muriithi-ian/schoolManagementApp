package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagementApp {
    public static void main(String[] args) {

        Teacher Beatrice = new Teacher(1,"Beatrice",800);
        Teacher Lisa = new Teacher(2,"Lisa",700);
        Teacher John = new Teacher(3,"John",900);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Beatrice);
        teacherList.add(Lisa);
        teacherList.add(John);


        Student Sasha = new Student(1,"Sasha",4);
        Student Ronny = new Student(2,"Ronny",12);
        Student Gabby = new Student(3,"Gabby",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Sasha);
        studentList.add(Gabby);
        studentList.add(Ronny);




        School nhs = new School("Nakuru High School",teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        nhs.addTeacher(megan);


        Sasha.payFees(5000);
        Ronny.payFees(6000);
        System.out.println("GHS has earned $"+ nhs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Beatrice.receiveSalary(Beatrice.getSalary());
        System.out.println("GHS has spent for salary to " + Beatrice.getName()
                +" and now has $" + nhs.getTotalMoneyEarned());

        John.receiveSalary(John.getSalary());
        System.out.println("GHS has spent for salary to " + John.getName()
                +" and now has $" + nhs.getTotalMoneyEarned());


        System.out.println(Ronny);

        Lisa.receiveSalary(Lisa.getSalary());

        System.out.println(Lisa);

    }
}
