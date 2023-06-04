package model.controller;

import model.Department;
import model.Faculty;

public class FacultyCreator {
    public Faculty createFaculty(String name, Department department) {
        return new Faculty(name, department);
    }
}
