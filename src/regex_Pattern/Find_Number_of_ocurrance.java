package regex_Pattern;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Find_Number_of_ocurrance {

	public static void main(String[] args) {
		String  str="arunjava programmer javaarun ";
		Pattern p=Pattern.compile("arun");
		Matcher m=p.matcher(str);
		while(m.find())
		{
			System.out.println(m.group()+"--"+m.start());
		}
		
	}

}
