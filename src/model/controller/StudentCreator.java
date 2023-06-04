package model.controller;

import model.*;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }
}

