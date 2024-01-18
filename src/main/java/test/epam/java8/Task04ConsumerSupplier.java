package test.epam.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

import test.epam.java8.helperClasses.Products;

public class Task04ConsumerSupplier {

	public static void mainTask04ConsumerSupplier() {

		List<Products> productList = new ArrayList<>();
		productList.add(new Products("Laptop", 1200, "Electronics", "Regular"));
		productList.add(new Products("Mobile", 800, "Electronics", "Regular"));
		productList.add(new Products("TV", 3500, "Electronics", "Regular"));
		productList.add(new Products("Book", 15, "Stationery", "Regular"));

		// Consumer 1: Print product to file or console based on the print parameter
		Consumer<Products> printConsumer = product -> {
			System.out.println("Printing to console: " + product.toString());
		};

		// Consumer 2 - Write a Consumer to update the grade of the product as 'Premium'
		// if the price is > 1000/-. Given the product list,
		// update the grade for each product and print all of the products
		Consumer<Products> updateGradeConsumer = product -> {
			if (product.price > 1000) {
				product.grade = "Premium";
			}
		};

		// Consumer 3 - Write a Consumer to update the name of the product to be
		// suffixed with '*' if the price of product is > 3000/-.
		// Given the product list, update the name for each product and print all of the
		// products
		Consumer<Products> updateNameConsumer = product -> {
			if (product.price > 3000) {
				product.name = product.name + "*";
			}
		};

		// Supplier 1: Produce a random product
		Supplier<Products> randomProductSupplier = () -> {
			Random random = new Random();
			return new Products("RandomProduct", random.nextInt() * 5000, "RandomCategory", "Regular");
		};

		// Supplier 2: Produce a random OTP
		Supplier<String> randomOtpSupplier = () -> {
			Random random = new Random();
			return String.format("%04d", random.nextInt(10000));
		};

		Consumer<Products> updateAndPrintConsumer = updateGradeConsumer.andThen(updateNameConsumer)
				.andThen(updateGradeConsumer).andThen(printConsumer);

		productList.forEach(updateAndPrintConsumer);

		productList.stream().filter(product -> "Premium".equals(product.grade) && product.name.endsWith("*"))
				.forEach(printConsumer);

		// Using Supplier 1 to produce a random product
		Products randomProduct = randomProductSupplier.get();
		System.out.println("Random Product: " + randomProduct);

		// Using Supplier 2 to produce a random OTP
		String randomOtp = randomOtpSupplier.get();
		System.out.println("Random OTP: " + randomOtp);

	}

}
