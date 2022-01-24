import java.util.ArrayList;
import java.util.List;

public class MainImparative {

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
		for(Person person :people)
		{
			if(Gender.FEMALE.equals(person.getGender()))
			{
				females.add(person);
			}
		}
		System.out.println(females);
	}
}
