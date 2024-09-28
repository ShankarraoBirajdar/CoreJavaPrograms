package StringPrograms;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "\nShankar Kedarnath Birajdar";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println("A".codePointAt(0));
		System.out.println("Z".codePointAt(0));
		System.out.println("a".codePointAt(0));
		System.out.println("z".codePointAt(0));
		System.out.println(str.codePointAt(0));
		
		System.out.println(str.codePointBefore(1));
		
		System.out.println(str.codePointCount(0,7));
		
		System.out.println(str.compareTo("S"));//returns no of char not matched
		System.out.println(str.compareToIgnoreCase("s"));//ignore case sensitivity and returns no of char not matched
		
		System.out.println(str.concat(" nice"));
		
		System.out.println(str.contains("S"));
		System.out.println(str.contains("s"));
		
		System.out.println(str.contentEquals("Shankar Kedarnath Birajda"));
		System.out.println(str.contentEquals("Shankar Kedarnath Birajdar"));
		
		System.out.println(str.indent(4));//add space before string
		
		System.out.println(str.indexOf('S'));
		System.out.println(str.indexOf('K',0));
		System.out.println(str.indexOf("Birajdar", 0));
		
		System.out.println(str.intern());
		
		System.out.println(str.lastIndexOf('r'));
		
		
		System.out.println(str.repeat(3));
		
		str.codePoints().forEach(System.out::print);
		System.out.println();
		
		String str2 
        = "        Geeks For Geeks Internship    !   "; 

    // removing leading and 
    // trailing white spaces 
    System.out.println(str2.strip()); 

    // removing leading white spaces 
    System.out.println(str2.stripLeading()); 

    // removing trailing white spaces 
    System.out.println(str2.stripTrailing()); 
    
    System.out.println(str.substring(1));
    System.out.println(str.substring(0,7));
    System.out.println(str.substring(8,17));
    
    
 // Chaining transformations
    String reversedUpperCaseStr = str.transform(String::toUpperCase)
                                    .transform(s -> new StringBuilder(s).reverse().toString());
    System.out.println("Reversed Uppercase String: " + reversedUpperCaseStr);
    
    char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
    String myStr2 = "";
    myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
    System.out.println("Returned String: " + myStr2);  
    
    
    String s = "Welcome \n to \n tutorials \n point";
    System.out.println(s);
    System.out.println(s.translateEscapes());
    
    
    System.out.println("".isEmpty());
    System.out.println(" ".isEmpty());
    System.out.println("\n".isEmpty());   
    
    System.out.println("".isBlank());
    System.out.println(" ".isBlank());
    System.out.println("\n".isBlank());  
    
//  We know that creating an object is a costly operation in Java. 
//  Therefore, to save time, Java developers came up with the concept of String Constant Pool (SCP).
//  The SCP is an area inside the heap memory. It contains the unique strings.
//  In order to put the strings in the string pool, one needs to call the intern() method.
//  Before creating an object in the string pool, the JVM checks whether the string is already present in the pool or not.
//  If the string is present, its reference is returned.
    
    String s1 = "Javatpoint";  
    String s2 = s1.intern();  
    String s3 = new String("Javatpoint");  
    String s4 = s3.intern();          
    System.out.println(s1==s2); // True  
    System.out.println(s1==s3); // False  
    System.out.println(s1==s4); // True       
    System.out.println(s2==s3); // False  
    System.out.println(s2==s4); // True        
    System.out.println(s3==s4); // False   
    
    
//    A string literal always invokes the intern() method,
//    whether one mention the intern() method along with the string literal or not. 
    String ss = "d".intern();  
    String p = "d"; // compiler treats it as String p = "d".intern();  
    System.out.println(ss == p); // prints true  
    
    
//    Whenever we create a String object using the new keyword, two objects are created
//    String str = new ("Hello World");  
//    one object is created in the heap memory outside of the SCP because of the usage of the new keyword
//    one object is created inside the SCP, provided the literal "Hello World" is already not present in the SCP.
    

    
	}

	

	
}
