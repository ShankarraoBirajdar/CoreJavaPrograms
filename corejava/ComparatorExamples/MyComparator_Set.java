package ComparatorExamples;


import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MyComparator_Set {

	public static void main(String[] args) {
		
		//Descending Order Logic Using Ternary Operator - Lambda Expression
//		Set<Integer> set = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		
		//Ascending Order Logic Using Ternary Operator - Lambda Expression
//		Set<Integer> set = new TreeSet<Integer>((I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0);

		Set<Integer> set = new TreeSet<Integer>(new MyComparator3());
		
		set.add(104);
		set.add(101);
		set.add(103);
		set.add(102);
		
		System.out.println(set);
	}

}

class MyComparator3 implements Comparator<Integer> {
	
//	@Override
//	public int compare(Integer I1, Integer I2) {
//		//Ascending Order Logic Using Ternary Operator
//		return  (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;
//	}
	
	@Override
	public int compare(Integer I1, Integer I2) {
		//Descending Order Logic Using Ternary Operator
		return  (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0;
	}

//	@Override
//	public int compare(Integer I1, Integer I2) {
//		//Descending Order Logic
//		if (I1 > I2) {
//			return -1;
//		} else if (I1 < I2) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
	
//	@Override
//	public int compare(Integer I1, Integer I2) {
//		//Ascending Order Logic
//		if (I1 > I2) {
//			return -1;
//		} else if (I1 < I2) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}


}
