package LambdaExpressionWithCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator_ArrayList {

	public static void main(String[] args) {



		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(104);
		list.add(101);
		list.add(103);
		list.add(102);
		
		
		//Descending Order Logic Using Ternary Operator - Lambda Expression
		Collections.sort(list,
				(I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		
		//Ascending Order Logic Using Ternary Operator - Lambda Expression
//		Collections.sort(list,
//				(I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0);


		System.out.println(list);
	}

}

