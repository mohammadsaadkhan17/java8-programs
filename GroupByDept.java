package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDept {

	//Group Employees by Department and calculate the average Salary
	public static void main(String[] args) {
		
		List<MyEmployee> employees=Arrays.asList(
				new MyEmployee(101,"Sonu","IT",5000),
				new MyEmployee(102,"Monu","HR",4000),
				new MyEmployee(103,"Chotu","IT",1000),
				new MyEmployee(104,"Motu","IT",3000),
				new MyEmployee(105,"Monty","HR",9000),
				new MyEmployee(106,"Sonty","IT",7000),
				new MyEmployee(107,"John","CS",6000),
				new MyEmployee(108,"Jonny","CS",8000),
				new MyEmployee(109,"Honey","HR",4000)
				);
		
		Map<String, Double> result=employees.stream()
				                            .collect(Collectors.groupingBy(MyEmployee::getDepartment, 
				                            		Collectors.averagingDouble(MyEmployee::getSalary)));

		System.out.println(result);
	}

}

class MyEmployee{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public MyEmployee(int id, String name, String department, int salary) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "MyEmployee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
