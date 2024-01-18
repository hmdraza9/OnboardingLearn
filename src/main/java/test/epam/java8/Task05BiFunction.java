package test.epam.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import test.epam.java8.helperClasses.Products;

public class Task05BiFunction {

	public static void mainTask05BiFunction() {

		// 1. Given the name and price of the product, write a Bifunction to create a
		// product.
		printProducts();

		// 2. Given the Product and quantity of the products, write a BiFunction to
		// calculate the cost of products. A cart is a map of product and quantity.
		// Given the cart, calculate the cost of the cart

		Products laptop = new Products("Laptop", 2300, "Default", "Default");
		Products mobile = new Products("Mobile", 1600, "Default", "Default");
		Products battery = new Products("Battery", 800, "Default", "Default");

		BiFunction<Products, Integer, Integer> calculateProductsCost = (product, quantity) -> product.price * quantity;

		Map<Products, Integer> cart = new HashMap<Products, Integer>();
		cart.put(laptop, 2);
		cart.put(mobile, 1);
		cart.put(battery, 1);

		BiFunction<Map<Products, Integer>, BiFunction<Products, Integer, Integer>, Integer> calculateCartCost = (
				shoppingCart, costCalculator) -> shoppingCart.entrySet().stream()
						.mapToInt(entry -> costCalculator.apply(entry.getKey(), entry.getValue())).sum();

		int totalCartCost = calculateCartCost.apply(cart, calculateProductsCost);

		System.out.println("Total cart cost: " + totalCartCost);

	}

	public static void printProducts() {

		BiFunction<String, Integer, Products> createProducts = (name, price) -> new Products(name, price, "Electronic",
				"A");
		Products newProduct = createProducts.apply("New Laptop", 2100);
		System.out.println(newProduct);
	}

}
