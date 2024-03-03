package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {
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

        for (int i = 0; i <= studentGrades.size(); i++) {
            sum += grades[i];
        }

        return sum / grades.length;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> studentInfo = new HashMap<>();
        studentInfo.put("ISP", 8);
        studentInfo.put("TS", 4);
        studentInfo.put("SS", 6);
        Student student1 = new Student("Pop", "Ion", "345", studentInfo);

        List<Student> students = new ArrayList<>();
        addStudent(students, student1);

        student1.setName("Geo");
        System.out.println(student1.toString());
        removeStudent(students, student1);

        System.out.println();

    }
}
