import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import imparativeVsdeclarative.Gender;
import imparativeVsdeclarative.Person;

public class MainPredicate {

	public static void main(String[] args) {

		List<Person> people=List.of(
				new Person("Arun",Gender.MALE),
				new Person("vimal",Gender.MALE),
				new Person("kishore",Gender.MALE),
				new Person("lina",Gender.FEMALE),
				new Person("tessa",Gender.FEMALE)
				);
		List<Person> females=new ArrayList<>();
		
		Predicate<Person>predicate=person -> Gender.FEMALE.equals(person.getGender());
		females=people.stream()
			.filter(predicate)
			.collect(Collectors.toList());
		
		System.out.println(females);
	}

}
