package cloneable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class EmployeeList implements Iterable<Employee> {
	  private List<Employee> employees;

	    
	    public EmployeeList() {
	        this.employees = new ArrayList<>();
	    }

	    public void addEmployee(Employee employee) {
	        employees.add(employee);
	    }

	 
	    @Override
	    public Iterator<Employee> iterator() {
	        return employees.iterator();
	    }
}
