import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDeclarative {

	public static void main(String args[])
	{
		List<Person> people=List.of(
				new Person("Arun",Gender.MALE),
				new Person("vimal",Gender.MALE),
				new Person("kishore",Gender.MALE),
				new Person("lina",Gender.FEMALE),
				new Person("tessa",Gender.FEMALE)
				);
		List<Person> females=new ArrayList<>();
		
		
		females=people.stream()
			.filter(person -> Gender.FEMALE.equals(person.getGender()))
			.collect(Collectors.toList());
		
		System.out.println(females);
	}
}
