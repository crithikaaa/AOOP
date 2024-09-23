package management;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeSorting {

	public static void main(String[] args) {
		
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John Doe", "HR", 60000));
        employees.add(new Employee(102, "Jane Smith", "Finance", 75000));
        employees.add(new Employee(103, "Robert Brown", "IT", 50000));
        employees.add(new Employee(104, "Emily Davis", "Marketing", 65000));
        employees.add(new Employee(105, "Michael Clark", "Finance", 72000));

     
        System.out.println("Sorting by salary (ascending):");
        Collections.sort(employees, EmployeeComparators.compareBySalaryAsc);
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nSorting by salary (descending):");
        Collections.sort(employees, EmployeeComparators.compareBySalaryDesc);
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nSorting by name:");
        Collections.sort(employees, EmployeeComparators.compareByName);
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nSorting by department:");
        Collections.sort(employees, EmployeeComparators.compareByDepartment);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
