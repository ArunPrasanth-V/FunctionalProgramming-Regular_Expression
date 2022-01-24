public class Person {
	private final String name;
	private final Gender gender;
	public Person(String name,Gender gender)
	{
		this.name=name;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender ;
	}
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}

}
