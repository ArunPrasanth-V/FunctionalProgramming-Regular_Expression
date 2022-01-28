package Predicate;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import Predicate._Consumer.Customer;

public class _BiConsumer {
  public static void main(String args[])
  {
	  Customer customer=new Customer("Arun","6381355047");
	  greeting.accept(customer,false);
	  
}	

static BiConsumer<Customer,Boolean> greeting=(customer,istrue) -> System.out.println("Hello!! "+customer.getCustomerName()
+" Thanks for for Registering Your Phone Number and"
+ " by the way this your phone number "
+(istrue?customer.getCustomerNumber():"********")); 



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
