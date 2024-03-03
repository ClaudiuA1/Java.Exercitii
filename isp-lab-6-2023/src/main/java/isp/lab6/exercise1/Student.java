package isp.lab6.exercise1;

import java.util.HashMap;
import java.util.Objects;

public class Student {

    private String   name;
    private String firstName;
    private String iD;
    private HashMap<String, Integer> grades=new HashMap<>();

    public Student(String name, String firstName, String iD, HashMap<String, Integer> grades) {
        this.name = name;
        this.firstName = firstName;
        this.iD = iD;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getiD() {
        return iD;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
