package Function;

import java.util.function.Function;

public class SimpleFunctioExamples {

	public static void main(String[] args) {


		String str = "My Name Is Shankar Birajdar";
		
		//Remove Space from String
		Function<String, String> function=s->s.replaceAll(" ", "");
        System.out.println("After Removing Spaces: "+function.apply(str));
        
        //How Many Space is Present
        Function<String, Integer> function2=s->s.length()-s.replaceAll(" ", "").length();
        System.out.println("No of space present is: "+function2.apply(str));
        
        //Length
        Function<String, Integer> function3=s->s.length();
        System.out.println("No of space present is: "+function3.apply(str));
        
        

	}

}
