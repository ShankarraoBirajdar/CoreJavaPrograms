package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class State{
	 String stateName;
	 List<String> cities;
	
	public State(String stateName, List<String> cities) {
		super();
		this.stateName = stateName;
		this.cities = cities;
	}

	public List<String> getCities() {
		return cities;
	}

	
}
public class FlatMapExample1 {

	public static void main(String[] args) {
		List<State> states = new ArrayList<>();
		
		states.add(new State("Maharashtra", Arrays.asList("Mumbai","Pune","Solapur")));
		states.add(new State("Karnataka", Arrays.asList("Banglore","Mysore","Vijaypura")));
		
		states.stream().map(State::getCities).forEach(System.out::println);
//		states.stream().map(state->state.cities).forEach(System.out::println);
	
		states.stream().flatMap(state->state.cities.stream()).forEach(System.out::println);

	}

}
