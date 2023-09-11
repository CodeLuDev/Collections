package entity;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void verifyAddStudentTest() {

        StudentService studentService = new StudentService();

        // First student
        ArrayList<Integer> notes1 = new ArrayList<>();
        notes1.add(7);
        notes1.add(8);
        notes1.add(6);
        Student student1 = studentService.addStudent("Juan", notes1);

        Assertions.assertEquals("Juan", studentService.getStudentsList().get(0).getNameStudent());
        Assertions.assertEquals(notes1, studentService.getStudentsList().get(0).getNotes());

        // Second student
        ArrayList<Integer> notes2 = new ArrayList<>();
        notes2.add(9);
        notes2.add(8);
        notes2.add(9);
        Student student2 = studentService.addStudent("Maria", notes2);

        Assertions.assertEquals("Maria", studentService.getStudentsList().get(1).getNameStudent());
        Assertions.assertEquals(notes2, studentService.getStudentsList().get(1).getNotes());

    }

    @Test
    public void verifySizeListTest() {

        StudentService studentService = new StudentService();

        // First student
        ArrayList<Integer> notes1 = new ArrayList<>();
        notes1.add(7);
        notes1.add(8);
        notes1.add(6);
        Student student1 = studentService.addStudent("Juan", notes1);

        // Second student
        ArrayList<Integer> notes2 = new ArrayList<>();
        notes2.add(9);
        notes2.add(8);
        notes2.add(9);
        Student student2 = studentService.addStudent("Maria", notes2);

        Assertions.assertEquals(2, studentService.showSizeList());
    }

    @Test
    public void verifyIsStudentExist() {

        StudentService studentService = new StudentService();

        // First student
        ArrayList<Integer> notes1 = new ArrayList<>();
        notes1.add(7);
        notes1.add(8);
        notes1.add(6);
        Student student1 = studentService.addStudent("Juan", notes1);

        // Second student
        ArrayList<Integer> notes2 = new ArrayList<>();
        notes2.add(9);
        notes2.add(8);
        notes2.add(9);
        Student student2 = studentService.addStudent("Maria", notes2);

        boolean existeExpected = studentService.ifStudentExist(student2,"Maria");

        Assertions.assertTrue(existeExpected);
    }

    @Test
    public void finalNoteTest() {

        StudentService studentService = new StudentService();

        // First student final note
        ArrayList<Integer> notes1 = new ArrayList<>();
        notes1.add(7);
        notes1.add(8);
        notes1.add(6);
        double finalNote1 = studentService.finalNote(notes1);

        Assertions.assertEquals(7, finalNote1);

        //second student final note
        ArrayList<Integer> notes2 = new ArrayList<>();
        notes2.add(9);
        notes2.add(8);
        notes2.add(10);
        double finalNote2 = studentService.finalNote(notes2);

        Assertions.assertEquals(9, finalNote2);

    }

}
