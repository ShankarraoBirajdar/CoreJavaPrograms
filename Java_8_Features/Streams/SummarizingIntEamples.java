package Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingIntEamples {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		IntSummaryStatistics statistics = numbers.stream().collect(Collectors.summarizingInt(n->n.intValue()));
//		IntSummaryStatistics statistics = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		
		
		System.out.println(statistics);

	}

}
