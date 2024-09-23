package cloneable;

import java.util.Iterator;

public class TestEmployeeList {
	 public static void main(String[] args) {
	        // Create employees
	        Employee emp1 = new Employee("Doe", "12-05-1985", "1234567890", 101);
	        Employee emp2 = new Employee("Srk", "22-08-1990", "0987654321", 102);
	        Employee emp3 = new Employee("Emily", "15-12-1982", "1122334455", 103);

	        EmployeeList employeeList = new EmployeeList();
	        employeeList.addEmployee(emp1);
	        employeeList.addEmployee(emp2);
	        employeeList.addEmployee(emp3);

	        System.out.println("Employee details:");
	        Iterator<Employee> iterator = employeeList.iterator();
	        while (iterator.hasNext()) {
	            Employee employee = iterator.next();
	            System.out.println(employee);
	        }


	        try {
	            Employee clonedEmp = emp1.clone();
	            System.out.println("\nCloned Employee: " + clonedEmp);
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }
}
