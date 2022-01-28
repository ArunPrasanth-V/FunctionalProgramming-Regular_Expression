package Predicate;

import java.util.function.Function;
import java.util.function.*;
public class _Consumer {
	public static void main(String args[])
	{
		Customer customer=new Customer("Arun","6381355047");
		  System.out.println(greet.apply(customer));
		  greet.apply(customer);
		  
	}	
	
	static Function<Customer,String> greet=customer ->("Hello!! "+customer.getCustomerName()+
			" Thanks for for Registering Your Phone Number and"
			+ " by the way this your phone number "+customer.getCustomerNumber());

	
	static Consumer<Customer> greeting=customer -> System.out.println("Hello!! "+customer.getCustomerName()
	+" Thanks for for Registering Your Phone Number and"
	+ " by the way this your phone number "
	+customer.getCustomerNumber()); 
	
	
	
	static class Customer
	{
		private final String customerName;
		private final String customerNumber;
		Customer(String customerName,String customerNumber)
		{
			this.customerName=customerName;
			this.customerNumber=customerNumber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public String getCustomerNumber() {
			return customerNumber;
		}		
	}
}
