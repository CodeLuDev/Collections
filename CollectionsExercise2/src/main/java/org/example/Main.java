package org.example;

import org.example.entity.Student;
import org.example.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

/*
Español
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.

English
Create a class called Student that maintains information about grades from different students.
students. The Student class will have as attributes its name and a list of type Integer
with its 3 notes.
In the Student service we should have a loop that creates a Student object. is requested
all the information to the user and that Student is saved in a list of type Student and will be
asks the user if he wants to create another Student or not.
After that loop we will have the following method in the Student service:
NotaFinal() method: The user enters the name of the student who wants to calculate their grade
final and looks for it in the list of Students. If it is in the list, the method is called. Inside
of the method, the grades list will be used to calculate the student's final average. Being this
final average, returned by the method and displayed in main.
 */
public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        Scanner read = new Scanner(System.in);

        boolean finish = false;
        Student student;
        ArrayList<Integer> notes = new ArrayList<>();

        do {
            System.out.print("Enter the name of a new student: ");
            String name = read.next();

            System.out.println("Enter 3 notes: ");
            for (int i=1; i<4; i++) {
                System.out.print("Note " + i +": ");
                int note = read.nextInt();
                notes.add(note);
            }

            student = new Student(name,notes);

            studentService.addStudent(student.getNameStudent(),student.getNotes());

            System.out.print("Do you want to add a new student? Answer Y for yes and N for no: ");
            String answer = read.next();
            if (answer.equalsIgnoreCase("n")) {
                finish = true;
            }

        } while (!finish);

        System.out.print("Enter a name to found this student to do his/her final note: ");
        String studentToFind = read.next();
        boolean exist = studentService.ifStudentExist(student,studentToFind);

        if (exist) {
            double finalNote = studentService.finalNote(student.getNotes());
            System.out.println("The final note of "+ studentToFind + " is: " + finalNote);
        } else {
            System.out.println("The student doesn't exist!");
        }

    }
}