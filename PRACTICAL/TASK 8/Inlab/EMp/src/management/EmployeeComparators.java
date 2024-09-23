package management;
import java.util.Comparator;

public class EmployeeComparators {
	public static Comparator<Employee> compareBySalaryAsc = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };

   
    public static Comparator<Employee> compareBySalaryDesc = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e2.getSalary(), e1.getSalary());
        }
    };

    
    public static Comparator<Employee> compareByName = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

  
    public static Comparator<Employee> compareByDepartment = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getDepartment().compareTo(e2.getDepartment());
        }
    };
}
