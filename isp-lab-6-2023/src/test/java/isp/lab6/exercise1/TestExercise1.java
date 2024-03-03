package isp.lab6.exercise1;


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class TestExercise1 {


    public static void addStudent(List<Student> students, Student student) {
        students.add(student);
    }

    public static void removeStudent(List<Student> students, Student student) {
        students.remove(student);
    }

    public static void updateStudent(List<Student> students, Student student) {
        students.remove(student);
        students.add(student);

    }

    public static int averageStudentGrade(Student student) {
        int sum = 0;
        Collection<Integer> studentGrades = student.getGrades().values();
        Integer[] grades = studentGrades.toArray(new Integer[studentGrades.size()]);

        for (int i = 0; i < studentGrades.size(); i++) {
            sum += grades[i];
        }

        return sum/grades.length;


    }
    @Test
    public static void main(String[] args) {
        HashMap<String, Integer> studentInfo = new HashMap<>();
        studentInfo.put("ISP", 8);
        studentInfo.put("TS", 4);
        studentInfo.put("SS", 6);
        Student student1 = new Student("Pop", "Ion", "345", studentInfo);
        Student student2 = new Student("Ghe", "Nicu", "567", studentInfo);

        List<Student> students = new ArrayList<>();

        assertEquals(0,students.size());
        addStudent(students, student1);
        assertEquals(1,students.size());

        removeStudent(students,student1);
        assertEquals(0,students.size());

        addStudent(students, student1);
        addStudent(students, student2);

        student2.setName("Vasile");
        updateStudent(students,student2);

        assertEquals("Vasile",students.get(1).getName());

        assertEquals(6,averageStudentGrade(student1));

        System.out.println();


    }
}
