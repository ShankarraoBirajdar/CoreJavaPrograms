package DiamondOperatorEnhancements;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Example3 {

	public static void main(String[] args) {
		String[] animal= {"Dog","Cat","Rat","Tiger","Elephant"};

		Iterator<String> itr= new Iterator<>() {
			
			int i=0;
			@Override
			public String next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				return animal[i++];
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return i<animal.length;
			}
		};
		
		
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}

}
