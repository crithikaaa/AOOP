package skill5;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void deleteStudent(int id);
}
