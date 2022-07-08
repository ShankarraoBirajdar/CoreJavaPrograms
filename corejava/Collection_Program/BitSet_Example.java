package Collection_Program;

import java.util.BitSet;

public class BitSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet obj = new BitSet(5);
		
		for (int i = 5; i < 10; ++i)
		obj.set(i);
		System.out.print(obj);
		 obj.clear(6);//not work on index 
		 System.out.print(obj);

		 
		

	}

}
