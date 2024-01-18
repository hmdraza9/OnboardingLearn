package test.epam.java8;

import java.util.Arrays;
import java.util.List;

import test.epam.java8.helperClasses.Products;
import test.epam.java8.helperClasses.Response;

public class Task02Predicates {

	public static void mainTask02Predicates() {

		List<Products> productList = Arrays.asList(
				new Products("Laptop", 1800, "Electronics", "A"),
				new Products("Mobile", 700, "Electronics", "B"), 
				new Products("Washing Machine", 1000, "Domestic", "A"),
				new Products("Microwave", 1050, "Electronics", "A"), 
				new Products("Inverter", 1250, "Electronics", "A"),
				new Products("Battery", 100, "Electronics", "D"), 
				new Products("MousePad", 99, "Electronics", "D"),
				new Products("Vacuum Cleaner", 1100, "Domestic", "C"));

		List<Response> responseList = Arrays.asList(
				new Response("{\"id\": 1, \"name\": \"John\"}", 200, "JSON"),
				new Response("Error: Bad Request", 400, "Text"),
				new Response("{\"message\": \"Success\"}", 200, "JSON"),
		new Response("Error: Bad Request", 400, "JSON"));

		// Predicate 1 - Define a predicate to check if the price of given product is
		// greaterthan 1000/-. Print all the products from the given list of the
		// products if the price is greaterthan 1000/-.
		System.out.println("Product price>1000:");
		productList.stream().filter(product -> (product.price > 1000)).forEach(product -> {
			System.out.println(product.name);
		});

		// Predicate 2 - Define a predicate to check if the product is of electronics
		// category. Print all the products from the given list of the products if the
		// product is of electronics category
		System.out.println("\nElectronics device:");
		productList.stream().filter(product -> product.category.equalsIgnoreCase("Electronics")).forEach(product -> {
			System.out.println(product.name);
		});

		// Predicate 3 - Print all the products from the given list of product if the
		// product price is greaterthan 100/- which are in electronics category

		System.out.println("\nElectronics device price>100:");
		productList.stream()
				.filter(product -> product.category.equalsIgnoreCase("Electronics") && (product.price > 100))
				.forEach(product -> System.out.println(product.name));

		// Predicate 4 - Print all the products from the given list of product if the
		// product price is greaterthan 100/- or product is in electronics category

		System.out.println("\nElectronics device or price>100:");
		productList.stream()
				.filter(product -> product.category.equalsIgnoreCase("Electronics") || (product.price > 100))
				.forEach(product -> System.out.println(product.name));

		// Predicate 5 - Print all the products from the given list of product if the
		// product price is lessthan 100/- and product is in electronics category.

		System.out.println("\nElectronics device and price<100:");
		productList.stream()
				.filter(product -> product.category.equalsIgnoreCase("Electronics") && (product.price < 100))
				.forEach(product -> System.out.println(product.name));

		// Predicate 6 - Define a predicate to check if the status code is 400. 
		//Print all the responses with status code 400 from the given list of responses

		System.out.println("\nResponses where status code is 400:");

		responseList.stream().filter(response->response.responseCode==400)
		.forEach(response->System.out.println(response.responseCode+" "+response.responseBody));
		
		//Predicate 7 - Define a predicate to check if the response type JSON. 
		//Print all the responses the response type JSON from the given list of responses

		System.out.println("\nResponses where response type is 'JSON':");
		
		responseList.stream().filter(response->response.responseType.equals("JSON"))
		.forEach(response->System.out.println("-->"+response.responseType+" "+response.responseBody));
		
		//Predicate 8 - Print all the responses with status code 400 and response type JSON

		System.out.println("\nResponses with status code 400 and response type 'JSON':");
		
		responseList.stream().filter(response->response.responseType.equals("JSON")&&(response.responseCode==400))
		.forEach(response->System.out.println("-->"+response.responseCode+" "+response.responseBody));
		
		//Predicate 8 - Print all the responses with status code 400 or response type JSON

		System.out.println("\nResponses with status code 400 or response type 'JSON':");
		
		responseList.stream().filter(response->response.responseType.equals("JSON")||(response.responseCode==400))
		.forEach(response->System.out.println("-->"+response.responseCode+" "+response.responseBody));
		
		//Predicate 8 - Print all the responses with status code is not 400 and response type JSON

		System.out.println("\nResponses with status code is not 400 and response type 'JSON':");
		
		responseList.stream().filter(response->response.responseType.equals("JSON")||(response.responseCode!=400))
		.forEach(response->System.out.println("-->"+response.responseCode+" "+response.responseBody));
		
	}

}
