package org.example.entity;

import java.util.ArrayList;

public class Student {

    private String nameStudent;
    private ArrayList<Integer> notes;

    public Student() {
    }

    public Student(String nameStudent, ArrayList<Integer> notes) {
        this.nameStudent = nameStudent;
        this.notes = notes;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }
}
