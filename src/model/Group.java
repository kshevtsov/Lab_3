package model;

public class Group {
    private String name;
    private Student student;

    public Group(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }
}
