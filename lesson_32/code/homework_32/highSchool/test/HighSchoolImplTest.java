package homework_32.highSchool.test;

import homework_32.highSchool.dao.HighSchool;
import homework_32.highSchool.dao.HighSchoolImpl;
import homework_32.highSchool.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighSchoolImplTest {

    private HighSchool highSchool;

    @BeforeEach
    void setUp() {
        highSchool = new HighSchoolImpl(10);
        highSchool.addStudent(new Student(1, "Alice", 18,4.5));
        highSchool.addStudent(new Student(2, "Bob", 19,3.0));
        highSchool.addStudent(new Student(3, "Charlie", 25,4.0));
        highSchool.addStudent(new Student(4, "David", 30,5.0));

    }

    @Test
    void testAddStudent() {
        assertEquals(4,highSchool.size());
    }

    @Test
    void testFindStudentById() {
        Student foundStudent = highSchool.findStudentById(1);
        assertNotNull(foundStudent);
        assertEquals("Alice",foundStudent.getName());
        Student notFound = highSchool.findStudentById(5);
        assertNull(notFound);
    }

    @Test
    void testRemoveStudentById() {
        Student removeStudent = highSchool.removeStudentById(1);
        assertNotNull(removeStudent);
        assertEquals("Alice",removeStudent.getName());
        assertEquals(3,highSchool.size());
    }

    @Test
    void testFindStudentsByAverageScore() {
        Student[] expected = {
                new Student(1, "Alice", 18, 4.5),
                new Student(3, "Charlie", 25, 4.0),
                new Student(4, "David", 30, 5.0)
        };
        Student[] actual = highSchool.findStudentsByAverageScore(4.0, 5.0);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFindStudentsByAgeRange() {
        Student[] expected = {
                new Student(1, "Alice", 18, 4.5),
                new Student(2, "Bob", 19, 3.0),
                new Student(3, "Charlie", 25, 4.0)
        };
        Student[] actual = highSchool.findStudentsByAgeRange(18, 25);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRemoveNonExistentStudent() {
        Student removedStudent = highSchool.removeStudentById(99);
        assertNull(removedStudent);
    }


    @Test
    void testPrintStudents() {
        highSchool.printStudents();
        System.out.println(highSchool);
    }
} // end of class