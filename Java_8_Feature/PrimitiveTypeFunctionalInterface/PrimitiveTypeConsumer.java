package PrimitiveTypeFunctionalInterface;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class PrimitiveTypeConsumer {

	public static void main(String[] args) {


		// AutoBoxing is Required Here
		Consumer<Integer> consumer1=I->{
			System.out.println("Ans is: "+I*I);
		};
		consumer1.accept(10);
		
		// AutoBoxing is Not Required Here
		IntConsumer consumer2=I->{
			System.out.println("Ans is: "+I*I);
		};
		consumer2.accept(20);
		
//		IntConsumer
//		 void accept(int value);
		
//		LongtConsumer
//		void accept(long value);
		
//		DoubleConsumer
//		void accept(double value);
		
//		ObjIntConsumer<T>
//		public Void accept(T t,int i)
		
//		ObjLongtConsumer<T>
//		public Void accept(T t,Long l)
		
//		ObjDoubleConsumer<T>
//		public Void accept(T t,double d)

	}

}
