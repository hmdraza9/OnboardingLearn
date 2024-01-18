package test.epam.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Task01LambdaExp {

	public static void mainTask01LambdaExp() {

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(6);
		numList.add(3);
		numList.add(4);
		numList.add(2);
		numList.add(7);
		numList.add(8);
		numList.add(5);
		Set<Integer> numSet = new HashSet<Integer>();
		numSet.addAll(numList);

		Map<Integer, String> numStringMap = new HashMap<Integer, String>();
		numStringMap.put(1, "One");
		numStringMap.put(2, "Two");
		numStringMap.put(3, "Three");
		numStringMap.put(4, "Four");
		numStringMap.put(5, "Five");
		numStringMap.put(6, "Six");
		numStringMap.put(7, "Seven");
		numStringMap.put(8, "Eight");

		isPalindrome("radar");
		$2ndHighNum(new Integer[] { 5, 3, 9, 10, 4, 1, 4 });
		isRotation("hello", "lohel");
		printNumbers();
		System.out.println(sortNumbers(numList));
		System.out.println(createTreeSetForNumbers(numSet));
		System.out.println(createTreeMapForValues(numStringMap));

	}

	private static void isPalindrome(String testString) {
		// 1. Check if a given string is a palindrome

		Predicate<String> isPalindrome = (str) -> {
			String reversed = new StringBuilder(str).reverse().toString();
			return str.equals(reversed);
		};

		System.out.println(testString + " is palindrome? - " + isPalindrome.test(testString));

	}

	private static void $2ndHighNum(Integer[] numArray) {

		List<Integer> numList = Arrays.asList(numArray);

		Integer secondLargest = numList.stream().distinct().sorted((num1, num2) -> num2.compareTo(num1)).skip(1)
				.findFirst().orElse(null);

		System.out.println("Secondlargest number is: " + secondLargest);

	}

	private static void isRotation(String str1, String str2) {
		BiPredicate<String, String> areRotations = (s1, s2) -> {
			if (s1.length() == s2.length() && !s1.isEmpty()) {
				String concatenated = s1 + s1;
				return concatenated.contains(s2);
			}
			return false;
		};

		System.out.println("Are string '" + str1 + "' and '" + str2 + "' rotation of each other? '"
				+ areRotations.test(str1, str2) + "'");
	}

	// Method to start a new thread and print numbers from 1 to 10
	private static void printNumbers() {
		Runnable runnable = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}

	// Method to sort a list of numbers in reverse order using Comparator
	private static List<Integer> sortNumbers(List<Integer> numbers) {
		System.out.println("Before reversion: " + numbers);
		System.out.println("After reversion: ");
		numbers.sort(Comparator.reverseOrder());
		return numbers;
	}

	// Method to create a TreeSet that sorts a set of numbers in reverse order
	private static TreeSet<Integer> createTreeSetForNumbers(Set<Integer> numbers) {
		return new TreeSet<>(Comparator.reverseOrder());
	}

	// Method to create a TreeMap that sorts a set of values in descending order
	private static TreeMap<Integer, String> createTreeMapForValues(Map<Integer, String> values) {
		return new TreeMap<>(Comparator.reverseOrder());
	}
}
