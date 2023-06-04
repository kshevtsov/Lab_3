package model.controller;

import model.Group;
import model.Student;

public class GroupCreator {
    public Group createGroup(String name, Student student) {
        return new Group(name, student);
    }
}
