package test.epam.task01;

import java.util.function.Predicate;

public class LambdaIsPalindrome {

	public static void isPalindrome(String stringg) {

		Predicate<String> isPalindrone = str -> {
			String reversed = new StringBuilder(stringg).reverse().toString();
			return str.equals(reversed);
		};

		System.out.println("Is Pallindone: " + isPalindrone.test(stringg));

	}
}
