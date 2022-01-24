import java.util.function.Function;

public class _Function {
	public static void main(String args[])
	{
		
		int num=increment.apply(0);
		System.out.println(num);
		
		Function<Integer,Integer> add_Mul=increment.andThen(multiply);
		int number=add_Mul.apply(0);
		
		System.out.println(number);
	}
	static Function<Integer,Integer> increment=number -> ++number;
	
	static Function<Integer,Integer> multiply=number ->number*10;
	
	static int inc(int num)
	{
		return ++num;
	}
}
