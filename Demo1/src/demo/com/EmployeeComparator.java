package demo.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e0 = new Employee(11,"Pitabas",200);
		Employee e1 = new Employee(11,"Pradyumn",500);
		Employee e2 = new Employee(11,"linga",500);
		Employee e3 = new Employee(11,"kartik",300);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e0);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}

			
			
		});
		

	}

	

}
