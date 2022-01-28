package Predicate;

import java.util.function.BiFunction;

public class _BiFunction {
	public static void main(String args[])
	{
		
		int n=num.apply(1,10);
		System.out.println(n);
	}
	
static BiFunction<Integer,Integer,Integer> num=(num1,num2)->(num1+1)*num2;

}
