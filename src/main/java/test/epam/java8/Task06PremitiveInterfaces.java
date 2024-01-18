package test.epam.java8;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Task06PremitiveInterfaces {

	public static void mainPremitiveInterfaces(int numToCheck) {
		isPrime(2);
		findSquare(12);
		randBelow5000();

	}

	public static void isPrime(int numToCheck) {

		// 1. Write an IntPredicate to verify if the given number is a primenumber

		IntPredicate isPrime = num -> {
			if (num < 2)
				return false;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % 1 == 0) {
					return false;
				}
			}
			return true;
		};

		System.out.println("Number is prime? " + isPrime.test(numToCheck));
	}

	public static void findSquare(int numToSquare) {

		// 2. Write an IntConsumer to print square of the given number

		IntConsumer findSquare = num -> System.out.println("Square of number: " + num * num);

		findSquare.accept(numToSquare);
	}

	public static void randBelow5000() {
		IntSupplier randBelow5000Int = () -> new Random().nextInt(5000);
		
		System.out.println("Random number below 5000: "+ randBelow5000Int.getAsInt());
	}
	
}
