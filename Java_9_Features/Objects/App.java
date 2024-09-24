package Objects;

import java.util.Objects;

public class App {

	public static void main(String[] args) {

		String str1 = "Shankar";
		String str2 = null;
		
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.requireNonNull(str1,"but its null"));
		System.out.println(Objects.requireNonNull(str2,"but its null"));

	}

}
