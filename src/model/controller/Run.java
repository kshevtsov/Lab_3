package model.controller;

import model.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        Student student = studentCreator.createStudent("John", "Doe", "Smith", Sex.MALE);
        Group group = groupCreator.createGroup("Group 1", student);
        Department department = departmentCreator.createDepartment("Department 1", group);
        Faculty faculty = facultyCreator.createFaculty("Faculty 1", department);
        University university = new University("University 1", faculty);

        System.out.println("University Name: " + university.getName());
        System.out.println("Faculty Name: " + university.getFaculty().getName());
        System.out.println("Department Name: " + university.getFaculty().getDepartment().getName());
        System.out.println("Group Name: " + university.getFaculty().getDepartment().getGroup().getName());
        System.out.println("Student Name: " + university.getFaculty().getDepartment().getGroup().getStudent().getName());
    }
}
