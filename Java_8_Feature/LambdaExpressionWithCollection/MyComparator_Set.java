package LambdaExpressionWithCollection;


import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MyComparator_Set {

	public static void main(String[] args) {
		
		//Descending Order Logic Using Ternary Operator - Lambda Expression
		Set<Integer> set = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		
		//Ascending Order Logic Using Ternary Operator - Lambda Expression
//		Set<Integer> set = new TreeSet<Integer>((I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0);

		
		set.add(104);
		set.add(101);
		set.add(103);
		set.add(102);
		
		System.out.println(set);
	}

}


