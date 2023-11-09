package Streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstAndAnyExample {

	public static void main(String[] args) {
		List<String>  vehicleList = Arrays.asList("Bike","Car","Truck","Bus","Train","Tractor");
		
		vehicleList.stream().findAny().ifPresent(System.out::println);
		
		vehicleList.stream().findFirst().ifPresent(System.out::println);

	}

}
