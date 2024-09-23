package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John Doe", 50000));
        employees.add(new Employee(102, "Jane Smith", 60000));
        employees.add(new Employee(103, "Mike Johnson", 55000));

        Collections.sort(employees);
        System.out.println("Employees sorted by ID (Comparable):");
        for (Employee e : employees) {
            System.out.println(e);
        }

      
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("\nEmployees sorted by Name (Comparator):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sorting using Comparator (by Salary)
        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println("\nEmployees sorted by Salary (Comparator):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Cloning an Employee object
        try {
            Employee clonedEmployee = employees.get(0).clone();
            System.out.println("\nCloned Employee: " + clonedEmployee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Iteration using Iterator
        System.out.println("\nIterating through the Employee list:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
