package ComparatorExamples;


import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyComparator_Map {

	public static void main(String[] args) {

		//Descending Order Logic Using Ternary Operator - Lambda Expression
//		Map<Integer,String> map = new TreeMap<Integer,String>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		
		//Ascending Order Logic Using Ternary Operator - Lambda Expression
//		Map<Integer,String> map = new TreeMap<Integer,String>((I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0);

		Map<Integer,String> map = new TreeMap<Integer,String>(new MyComparator4());

		map.put(104,"Pooja");
		map.put(101,"Shankar");
		map.put(103,"Priyanka");
		map.put(102,"Onkar");
		
		System.out.println(map);
	}

}

class MyComparator4 implements Comparator<Integer> {
	
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
