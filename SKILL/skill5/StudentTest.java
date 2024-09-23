package skill5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testAddStudent() {
        // Arrange
        StudentService studentService = new StudentServiceImpl();
        Student student = new Student(1, "Krithika", "Cybersecurity");

        // Act
        studentService.addStudent(student);

        // Assert
        assertEquals(1, studentService.getAllStudents().size());
        assertEquals("Krithika", studentService.getStudentById(1).getName());
    }

    @Test
    public void testAddGraduateStudent() {
        // Arrange
        StudentService studentService = new StudentServiceImpl();
        GraduateStudent gradStudent = new GraduateStudent(2, "John", "Computer Science", "AI in Cybersecurity");

        // Act
        studentService.addStudent(gradStudent);

        // Assert
        assertEquals(1, studentService.getAllStudents().size());  // Ensure there is 1 student
        assertEquals("John", studentService.getStudentById(2).getName());  // Validate student's name
        assertEquals("AI in Cybersecurity", ((GraduateStudent) studentService.getStudentById(2)).getThesisTitle());  // Validate thesis
    }

    @Test
    public void testDeleteStudent() {
        // Arrange
        Student
