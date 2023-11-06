package BiConsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class SimpleBiConsumerExample {

	public static void main(String[] args) {


		//Consumer
		Consumer<String> consumer=s->{
			System.out.println("length: "+s.length());
		};
		consumer.accept("Shankar");
		
		//BiConsumer
		BiConsumer<Integer, Integer> biConsumer=(a,b)->System.out.println("Addition: "+ (a+b));
		biConsumer.accept(10, 20);

	}

}
