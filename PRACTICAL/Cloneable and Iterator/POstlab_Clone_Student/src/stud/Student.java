package stud;

public class Student implements Cloneable {
	private String name;
    private int rollNumber;
    private double marks;


    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll Number=" + rollNumber + ", Marks=" + marks + "]";
    }
    
    public static void main(String[] args) {
        try {
        
            Student student1 = new Student("Esha", 101, 95.5);
            System.out.println("Original Student: " + student1);

     
            Student student2 = (Student) student1.clone();
            System.out.println("Cloned Student: " + student2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
