package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

	public static void main(String[] args) {


		List<String>  vehicleList = Arrays.asList("Bike","Car","Truck","Bus","Train","Tractor");
		String  vehicles = vehicleList.stream().collect(Collectors.joining(","));
		System.out.println(vehicles);
		
		List<String>  vehicleList2 = Arrays.asList("Bike","Car","Truck","Bus","Train","Tractor");
		String  vehicles2 = vehicleList2.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(vehicles2);
		
		
	}

}

 