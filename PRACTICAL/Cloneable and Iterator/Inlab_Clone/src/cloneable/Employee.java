package cloneable;


public class Employee implements Cloneable {
	private String name;
    private String dob; 
    private String mobileNumber;
    private int id;

  
    public Employee(String name, String dob, String mobileNumber, int id) {
        this.name = name;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.id = id;
    }

 
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getId() {
        return id;
    }

   
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", DOB=" + dob + ", Mobile=" + mobileNumber + "]";
    }
}
