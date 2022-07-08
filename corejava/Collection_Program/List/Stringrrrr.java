package Collection_Program.List;

public class Stringrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hi");//StringBuffer
		String s=new String("hi");//String
		
		
//		StringBuffer sb1=new StringBuffer("hi");
//		
//		String s1=new String("hi");
		
		StringBuilder sb2=new StringBuilder("hi");//StringBuilder

		System.out.println(s.toString()+""+sb.toString());
System.out.println(s.equals(sb));//false
System.out.println(sb.equals(s));//false
System.out.println(sb.toString()==s);//false
System.out.println(sb.toString().equals(s));//true
System.out.println(s.equals(sb.toString()));//true


System.out.println(s.equals(sb2));//false
System.out.println(sb.equals(sb2));//false
System.out.println(sb2.toString()==s);//false
System.out.println(sb2.toString().equals(s));//true
System.out.println(sb2.toString().equals(sb));//false

	}

}
