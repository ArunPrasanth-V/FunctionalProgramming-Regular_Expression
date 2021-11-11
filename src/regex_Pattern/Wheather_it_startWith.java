package regex_Pattern;
import java.util.regex.*;
public class Wheather_it_startWith {

	public static void main(String[] args) {
		String s="arun java programmer";
		Pattern p=Pattern.compile("//s");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println("worst"+m.group());	
		}
		
	}

}
