package Predicate;
import java.util.function.*;
public class _Pridicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(valid.test("9999903465"));
      System.out.println(isNumberValid("9999903465"));
	}
	static Predicate<String> valid=number ->number.length()>9;
	static boolean isNumberValid(String no)
	{
		return no.length()>9;
	}

}
