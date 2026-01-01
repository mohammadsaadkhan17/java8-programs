package streamseg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidByDept {

	//Find the highest paid Employee in each Department
	public static void main(String[] args) {
		
		List<Employee> employee =Arrays.asList(
				new Employee(101,"Sonu","IT",5000),
				new Employee(102,"Monu","HR",4000),
				new Employee(103,"Chotu","IT",1000),
				new Employee(104,"Motu","IT",3000),
				new Employee(105,"Monty","HR",9000),
				new Employee(106,"Sonty","IT",7000),
				new Employee(107,"John","CS",6000),
				new Employee(108,"Jonny","CS",8000),
				new Employee(109,"Honey","HR",4000)
				);
		
     Map<String, Optional<Employee>> highestSalaryInEachDept = employee.stream()
			                                	.collect(Collectors.groupingBy(Employee::getDepartment,
			                                	Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	    System.out.println(highestSalaryInEachDept);

	}

}
