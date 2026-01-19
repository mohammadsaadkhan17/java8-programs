package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HighestAvgSalaryDept {

	
	//Find department with highest average salary
	public static void main(String[] args) {
		
		List<Employee> employees=Arrays.asList(
        		new Employee(101,"Sonu","IT",5000),
 				new Employee(102,"Monu","HR",4000),
 				new Employee(103,"Chotu","IT",1000),
 				new Employee(104,"Motu","IT",3000),
 				new Employee(105,"Monty","HR",9000),
 				new Employee(106,"Sonty","IT",7000),
 				new Employee(107,"John","CS",6000),
 				new Employee(108,"Jonny","CS",8000),
 				new Employee(109,"Honey","HR",4000));

		
		Map.Entry<String, Double> collect=employees.stream()
		.collect(Collectors.groupingBy(
				Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)))
	     .entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.get();
		
		System.out.println(collect);
		
		
	}

}
