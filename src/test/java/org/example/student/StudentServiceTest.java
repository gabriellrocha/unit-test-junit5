package org.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService service;

    @BeforeEach
    void setup(){
        service = new StudentService();
    }

    @Test
    void getStudentsTestUsingAssertTrue() {

        List<Student> list = service.getListOfStudents();
//        list.add(new Student());

        boolean actualResult = list.isEmpty();


        assertTrue(actualResult);
//        assertTrue(actualResult, "List don't empty!");

//        Loading Lazy...

//        assertTrue(actualResult, () -> "List don't empty!");
//        assertTrue(() -> actualResult);
//        assertTrue(() -> actualResult, () -> "List don't empty");
    }


    @Test
    void getStudentsTestUsingAssertFalse() {

        var list = service.getListOfStudents();
        list.add(new Student());

        boolean actualResult = list.isEmpty();

//        assertFalse(actualResult);
//        assertFalse(() -> actualResult);
        assertFalse(actualResult, () -> "List should not be empty!");

    }

    @Test
    void getStudentByIdTestUsingAssertNull() {

        service.getListOfStudents().add(new Student(1, "Gabriel"));

        Student student = service.getStudentById(2);

//        assertNull(student);
//        assertNull(student, "Student object is not null " + student);
        assertNull(student, () -> "Student object is not null " + student);

    }

    @Test
    void getStudentByIdTestAssertNotNull() {

        var list = service.getListOfStudents();
        list.add(new Student(2, "Gabriel"));

        Student student = service.getStudentById(2);
//        assertNotNull(student, () -> "Student is null");

        assertNotNull(student);
    }

    @Test
    void getStudentByIdTestAssertEquals() {

        var list = service.getListOfStudents();
        list.add(new Student(1, "Gabriel"));
        var student = service.getStudentById(1);

        var objectActual = new Student(1, "Gabriel");

//        assertEquals(student, objectActual);
        assertEquals(student, objectActual, () -> "Objects Students are different");
    }

    @Test
    void getStudentByIdTestAssertNotEquals() {

        var student = new Student(10, "Gabriell");
        var student2 = new Student(10, "Gabriel");

        assertNotEquals(
                student, student2,
                () -> "The students are equals");
    }

    @Test
    void getStudentByUserNameTestUsingAssertThrows() { // assertThrows consider hierarchy


//        assertThrows(RuntimeException.class, () -> service.getStudentByName("Gabriel"));
        assertThrows(
                StudentNotFoundException.class,
                () -> service.getStudentByName("Gabriel"),
                () -> "StudentNotFoundException should be thrown"
        );
    }


    @Test
    void getStudentUserNameTestUsingAssertThrowsExactly() { // assertThrowsExactly not consider hierarchy

        var service = new StudentService();

        assertThrowsExactly(
                StudentNotFoundException.class,
                () -> service.getStudentByName("Gabriel"),
                () -> "StudentNotFoundException should be thrown"
        );
    }

}