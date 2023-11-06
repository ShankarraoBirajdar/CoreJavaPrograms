package Consumer;

import java.util.function.Consumer;

public class SimpleConsumerExample {

	public static void main(String[] args) {


		Consumer<String> consumer=s->{
			System.out.println("length: "+s.length());
		};
		
		consumer.accept("Shankar");

	}

}
