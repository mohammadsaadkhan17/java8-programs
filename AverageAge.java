package streamseg;

import java.util.Arrays;
import java.util.List;

public class AverageAge {
     
	//Calculate the average age of a List of a Person objects using Java Streams
	
	public static void main(String[] args) {
		
		List<Person> person =Arrays.asList(
				new Person("Aman", 24),
				new Person("Honey", 27),
				new Person("Bunny", 29),
				new Person("Sunny", 60),
				new Person("Sonu", 12),
				new Person("Monu", 19),
				new Person("Motu", 17),
				new Person("Chotu", 23));
		
		double averageAge =person.stream()
				.mapToInt(Person::getAge)
				.average()
				.orElse(0.0);
		
		System.out.println(averageAge);
		

	}

}

class Person{
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
