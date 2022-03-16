package basics;

public class Greet {

	public static void main(String[] args) {
     Stringlen str=s-> s.length();
     System.out.println(str.getLen("arun"));
	
     printLambda(s->s.length());
	}
public static void printLambda(Stringlen str)
{
	System.out.println(str.getLen("Hello Lambda!"));
}
}
interface Stringlen{
	int getLen(String s);
}
