package org.example.service;

import org.example.entity.Student;
import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> studentsList;

    public StudentService() {
        studentsList = new ArrayList<>(3);
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public Student addStudent(String name, ArrayList<Integer> notes) {
        Student student = new Student(name, notes);
        studentsList.add(student);

        return student;
    }

    public int showSizeList() {
        return studentsList.size();
    }

    public boolean ifStudentExist(Student student, String name) {
        return student.getNameStudent().equals(name);
    }
    
    public double finalNote(ArrayList<Integer> notes) {
        return (double) (notes.get(0) + notes.get(1) + notes.get(2)) / 3;
    }

}
