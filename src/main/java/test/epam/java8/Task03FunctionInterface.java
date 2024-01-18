package test.epam.java8;

import java.util.ArrayList;
import java.util.List;

import test.epam.java8.helperClasses.Products;

public class Task03FunctionInterface {

	public static void mainTask03functionOperator() {

		List<Products> listOfP = new ArrayList<>();

		listOfP.add(new Products("Mobile", 1200, "Electronics", "1"));
		listOfP.add(new Products("WM", 1100, "Domestic", "2"));
		listOfP.add(new Products("TV", 600, "Electronics", "3"));
		listOfP.add(new Products("Oven", 400, "Kitchen", "1"));
		listOfP.add(new Products("Tesla", 5500, "Electronics", "1"));
		listOfP.add(new Products("Fridge", 900, "Kitchen", "2"));
		listOfP.add(new Products("Sewing Machine", 350, "Personal", "3"));

		List<String> expProducts = new ArrayList<String>();
		List<String> electronicsProducts = new ArrayList<String>();
		int elecProducts = 0;

		for (Products p : listOfP) {
			if (p.price >= 1000) {
				expProducts.add(p.name);
			}
			if (p.category.equalsIgnoreCase("Electronics")) {
//				System.out.println("Electronics: " + p.name);
				electronicsProducts.add(p.name);
				if (p.price >= 1000)
					System.out.println("Costly Electronics: " + p.name.toUpperCase());
			}
			if (p.category.equalsIgnoreCase("Electronics")) {
//				System.out.println(456+" "+p.name);
				elecProducts++;
			}
		}

		for (String str : expProducts) {
			System.out.println("Expensive: " + str);
		}
		System.out.println("");

		for (String str : electronicsProducts) {
			System.out.println("Electronics: " + str);
		}
		System.out.println("");

		System.out.println("Electronic Products count: " + elecProducts);

	}

}
