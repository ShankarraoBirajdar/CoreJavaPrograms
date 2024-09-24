package Streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstAndAnyExample {

	public static void main(String[] args) {
		List<String>  vehicleList = Arrays.asList("Bike","Car","Truck","Bus","Train","Tractor");
		
		vehicleList.stream().findAny().ifPresent(System.out::println);
		
		vehicleList.stream().findFirst().ifPresent(System.out::println);
		
		int[] arr = {5,2,8,3,1,1};
     int a = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Array doesnt have the smallest element"));
     System.out.println(a);


	}

}
