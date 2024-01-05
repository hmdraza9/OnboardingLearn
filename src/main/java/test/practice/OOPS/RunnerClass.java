package test.practice.OOPS;

import test.epam.bouquet.Bouquet;
import test.epam.pizza.Pizza;
import test.epam.power.Fan;
import test.epam.power.Laptop;
import test.epam.power.Light;
import test.epam.power.TV;
import test.epam.power.Toaster;
import test.util.classes.Utils;

public class RunnerClass {

	public static void main(String[] args) {

		System.out.println("Now: " + Utils.getTime());
		System.out.println("****Cars****");
		Car car1 = new Car("Green", 4, "V8", "Chevvy", "234 BHP");
		Car car2 = new Car("Black", 3, "S4", "HM", "211 BHP");
		Car car3 = new Car("Grey", 5, "A4", "PAL", "123 BHP");

		System.out.println("Car 1>> " + car1.getCarColor() + "; " + car1.getCarNoOfTyres() + "; " + car1.getEngineName()
				+ "; " + car1.getEngineType() + "; " + car1.getEnginePower());
		System.out.println("Car 2>> " + car2.getCarColor() + "; " + car2.getCarNoOfTyres() + "; " + car2.getEngineName()
				+ "; " + car2.getEngineType() + "; " + car2.getEnginePower());
		System.out.println("Car 3>> " + car3.getCarColor() + "; " + car3.getCarNoOfTyres() + "; " + car3.getEngineName()
				+ "; " + car3.getEngineType() + "; " + car3.getEnginePower());

		System.out.println("\n\n****Pizza****");

		Pizza pizza = new Pizza(2, 4, 6);
		System.out.println("Prize of pizza: "
				+ (pizza.getBase("soft") + pizza.getTopMushrooms() + pizza.getTopCorn() + 2 * pizza.getTopTomato())
				+ "$");

		System.out.println("\n\n****Bouquet****");

		Bouquet bouquet = new Bouquet(1, 2, 3);
		System.out.println("Bouquet price: "
				+ (2 * bouquet.getRosePrice() + 3 * bouquet.getJasminePrice() + 4 * bouquet.getLilyPrice()) + "$");

		System.out.println("\n\n****Power****");

		Fan fan = new Fan(1, "USHA", 3);
		Laptop laptop = new Laptop(.5f, "Dell", 3);
		Light light = new Light(.2f, "Philips", 3);
		Toaster toaster = new Toaster(.8f, "Pigeon", 3);
		TV tv = new TV(.3f, "LG", 3);

		System.out.println("Total power consumtion: "
				+ (4 * fan.getUnit() + 2 * laptop.getUnit() +6*light.getUnit()+ 1 * toaster.getUnit() + 2 * tv.getUnit()));

	}

}
