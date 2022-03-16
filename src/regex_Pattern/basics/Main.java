package basics;

public class Main {

	public void greet(Greeting gre)
	{
           gre.perfome();
	}
  
	public static void main(String[] args) {
		Main call=new Main();
		HelloWorldGreeting hwg=new HelloWorldGreeting();
		call.greet(hwg);
		
		MyLambda myLambdaFunction=()->System.out.println("Hello World!");
		
		MyAdd addFunction=(int a,int b)-> a+b;
	}
   
}

interface MyLambda{
	void foo();
}
interface MyAdd {
	int add(int a,int b);
}
