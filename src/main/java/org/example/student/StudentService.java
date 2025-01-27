package org.example.student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {


    private final List<Student> listOfStudents = new ArrayList<>();

    public List<Student> getListOfStudents(){
        return listOfStudents;
    }

    public Student getStudentById(int id) {

        return listOfStudents.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Student getStudentByName(String name) {

        return listOfStudents.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student not found with name: " + name));

    }
}
