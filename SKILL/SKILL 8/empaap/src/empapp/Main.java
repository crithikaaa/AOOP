package empapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	
	    public static void main(String[] args) {
	       
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("Esha", "IT", 70000));
	        employees.add(new Employee("John", "HR", 50000));
	        employees.add(new Employee("Mike", "IT", 75000));
	        employees.add(new Employee("Sara", "Finance", 60000));
	        employees.add(new Employee("Sam", "HR", 55000));
	        employees.add(new Employee("Tom", "IT", 85000));
	        employees.add(new Employee("Anna", "Finance", 62000));
	        employees.add(new Employee("Paul", "Marketing", 45000));
	        employees.add(new Employee("Lucy", "Marketing", 40000));
	        employees.add(new Employee("David", "IT", 78000));

	       
	        List<Employee> filteredEmployees = employees.stream()
	            .filter(emp -> emp.getSalary() > 60000)
	            .collect(Collectors.toList());

	        System.out.println("Filtered Employees (salary > 60,000):");
	        filteredEmployees.forEach(System.out::println);

	        
	        List<Employee> sortedEmployees = employees.stream()
	            .sorted(Comparator.comparing(Employee::getSalary))
	            .collect(Collectors.toList());

	        System.out.println("\nEmployees sorted by salary (ascending):");
	        sortedEmployees.forEach(System.out::println);

	       
	        Optional<Employee> highestSalaryEmployee = employees.stream()
	            .max(Comparator.comparing(Employee::getSalary));

	        highestSalaryEmployee.ifPresent(emp -> 
	            System.out.println("\nEmployee with highest salary: " + emp));

	     
	        DoubleSummaryStatistics salaryStats = employees.stream()
	            .mapToDouble(Employee::getSalary)
	            .summaryStatistics();

	        System.out.println("\nAverage salary of employees: " + salaryStats.getAverage());
	    }
	}
