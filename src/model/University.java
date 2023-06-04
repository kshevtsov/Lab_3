package model;

public class University {
    private String name;
    private Faculty faculty;

    public University(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
