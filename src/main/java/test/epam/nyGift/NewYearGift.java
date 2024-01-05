package test.epam.nyGift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewYearGift {

	public static List<Confectionery> confList;

	public static void main(String[] args) {

		System.out.println("\n\n****Gift****");

		Chocolates chocolate1 = new Chocolates("Cadburry", 35, "Sweet");
		Chocolates chocolate2 = new Chocolates("Cadburry", 45, "Dark");
		Chocolates chocolate3 = new Chocolates("Kitkat", 15, "Sweet");
		Chocolates chocolate4 = new Chocolates("Kitkat", 25, "Dark");
		Chocolates chocolate5 = new Chocolates("Twix", 20, "Sweet");
		Chocolates chocolate6 = new Chocolates("Twix", 30, "Wafer");

		Sweets sweet2 = new Sweets("Laddu", 90, "Besan");
		Sweets sweet3 = new Sweets("Jalebi", 100, "Jaggery");
		Sweets sweet4 = new Sweets("Halwa", 250, "Moong");
		Sweets sweet5 = new Sweets("Barfi", 110, "Milk");
		Sweets sweet6 = new Sweets("Ghewar", 300, "Milk");

		double totalWeight = totalWeight(chocolate1, chocolate2, chocolate3, chocolate4, chocolate5, chocolate6, sweet2,
				sweet3, sweet4, sweet5, sweet6);
		filterCandies(100.0, 1000.0, chocolate1, chocolate2, chocolate3, chocolate4, chocolate5, chocolate6, sweet2,
				sweet3, sweet4, sweet5, sweet6);

		System.out.println("Total weight: " + totalWeight);

		// before sort
		System.out.println("Before sort");
		for (Confectionery conf : confList) {
			System.out.println(conf.getName() + " " + conf.getWeight());
		}

		Collections.sort(confList);

		// after sort
		System.out.println("\nAfter sort applied on weight");

		for (Confectionery conf : confList) {
			System.out.println(conf.getName() + " " + conf.getWeight());
		}

	}

	public static void filterCandies(double min, double max, Confectionery... confectioneries) {

		confList = new ArrayList<>();

		for (Confectionery confectionery : confectioneries) {
			confList.add(confectionery);
			if (confectionery.getWeight() > min && confectionery.getWeight() < max) {
				System.out.println("Candy withing range" + "[" + min + "," + max + "]gms" + ": "
						+ confectionery.getName() + "[" + confectionery.getWeight() + "]");
			}
		}

	}

	public static double totalWeight(Confectionery... confectioneries) {
		double tatalWeight = 0;
		for (Confectionery confectionery : confectioneries) {
			tatalWeight = tatalWeight + confectionery.getWeight();
		}
		return tatalWeight;
	}
}
