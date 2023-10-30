package ComparatorExamples;

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
		
		

//		Collections.sort(list,
//				(I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
//		Collections.sort(list,
//				(I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0);

		System.out.println("Before Sorting:: "+list);
		Collections.sort(list, new MyComparator2());
		System.out.println("After Sorting:: "+list);
	}

}

class MyComparator2 implements Comparator<Integer> {
	
//	@Override
//	public int compare(Integer I1, Integer I2) {
//		//Ascending Order Logic Using Ternary Operator
//		return  (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;
//	}
	
//	@Override
//	public int compare(Integer I1, Integer I2) {
//		//Descending Order Logic Using Ternary Operator
//		return  (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0;
//	}

//	@Override
//	public int compare(Integer I1, Integer I2) {
//		//Ascending Order Logic
//		if (I1 < I2) {
//			return -1;
//		} else if (I1 > I2) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
	
	@Override
	public int compare(Integer I1, Integer I2) {
		//Descending Order Logic
		if (I1 > I2) {
			return -1;
		} else if (I1 < I2) {
			return 1;
		} else {
			return 0;
		}
	}


}
