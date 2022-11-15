package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {


		String pattern = "a";
		String text = "Shankarrao";
		
		Pattern  pat=Pattern.compile(pattern);
		Matcher matcher = pat.matcher(text);
		int count=0;
		while (matcher.find()) {
			count++;
			System.out.println(matcher.start()+"--"+matcher.group()+"--"+matcher.end());
			
		}
		System.out.println("The no of occurences:"+count);

	}

}
