package grade;
import java.util.HashMap;
import java.util.Map;

public class StudentGradeManager {
	 private Map<String, Double> studentGrades;

	    public StudentGradeManager() {
	        studentGrades = new HashMap<>();
	    }

	    public void addOrUpdateGrade(String studentID, double grade) {
	        studentGrades.put(studentID, grade);
	        System.out.println("Grade updated for student ID " + studentID + ": " + grade);
	    }

	    public Double getGrade(String studentID) {
	        return studentGrades.get(studentID);
	    }

	    public void listAllGrades() {
	        if (studentGrades.isEmpty()) {
	            System.out.println("No grades available.");
	        } else {
	            System.out.println("Student Grades:");
	            for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
	                System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        StudentGradeManager gradeManager = new StudentGradeManager();

	        gradeManager.addOrUpdateGrade("S001", 88.5);
	        gradeManager.addOrUpdateGrade("S002", 92.0);
	        gradeManager.addOrUpdateGrade("S003", 78.0);

	        System.out.println("\nGrade for student ID S002: " + gradeManager.getGrade("S002"));

	        System.out.println("\nListing all student grades:");
	        gradeManager.listAllGrades();
	    }
}
