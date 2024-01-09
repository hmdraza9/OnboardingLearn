package test.epam.runner;

import test.epam.StringArray.ArrayFindMissingNum;
import test.epam.StringArray.ArrayMinMaxClass;
import test.epam.StringArray.StringDupChars;
import test.epam.StringArray.StringWordIsRotation;
import test.epam.bouquet.Bouquet;
import test.epam.corejava.DummyClass;
import test.epam.corejava.MethodOverrideLoad;
import test.epam.loggingANDloops.LooperClass;
import test.epam.loggingANDloops.TestLogging;
import test.epam.pizza.Pizza;
import test.epam.power.Fan;
import test.epam.power.Laptop;
import test.epam.power.Light;
import test.epam.power.TV;
import test.epam.power.Toaster;
import test.epam.task02.ParamFromConsole;
import test.epam.task05.task05LanguageConstruct;
import test.practice.OOPS.Car;
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

		System.out.println("Total power consumtion: " + (4 * fan.getUnit() + 2 * laptop.getUnit() + 6 * light.getUnit()
				+ 1 * toaster.getUnit() + 2 * tv.getUnit()));

		// Part 1
		System.out.println("***Printing Console input");
//		ParamFromConsole.printName();
		System.out.println("Calculation result: " + ParamFromConsole.calculator(40, 10, "*"));

		// Part 2
		System.out.println("\n\n***Printing Logs");
		TestLogging.loggingDemo();

		// Part 3
		System.out.println("\n\n***Printing Loops");
		LooperClass.usingWhileLoop(5, 3);
		System.out.println("\n\n");
		LooperClass.usingDoWhileLoop(5, 3);
		LooperClass.usingForLoop(5, 3);

		// Core Java - Overridden
		DummyClass objDum = new MethodOverrideLoad();
		objDum.dummyMethod();
		DummyClass objDum2 = new DummyClass();
		objDum2.dummyMethod();

		// Core Java - Overloaded
		MethodOverrideLoad.findArea(5);
		MethodOverrideLoad.findArea(2, 3);

		// static variable are initialized and allocated memory first, that's why no
		// constructor required
		System.out.println("Class variable : " + new DummyClass().classString);
		System.out.println("Static variable: " + DummyClass.staticString);
		System.out.println("Static access of variable MethodOverrideLoad.dclsStatic.classString: "
				+ MethodOverrideLoad.dclsStatic.classString);
		System.out.println("Non - Static access of variable new MethodOverrideLoad().dclsNonStatic.classString: "
				+ new MethodOverrideLoad().dclsNonStatic.classString);

//		ExceptionHandle.exceptionHandleMethod();

		// Arrays - missing number
		System.out.println("\nArrays - missing number");
		ArrayFindMissingNum.findMissNumber(1, 999, 466);

		// Arrays - min and max number
		System.out.println("\nArrays - min and max number");
		ArrayMinMaxClass.minMaxMethod();

		// String - find duplicate chars
		System.out.println("\nString - find duplicate chars");
		StringDupChars.findDupCharacters();

		// String - Given strings are rotation of each other
		System.out.println("\nString - Given strings are rotation of each other");
		StringWordIsRotation.stringIsRotation("helloa", "lohelp");

		// task05 - language construct - 1. caughtSpeeding
		System.out.println("\ntask05 - language construct - caughtSpeeding");
		task05LanguageConstruct.caughtSpeeding(85, true);

		// task05 - language construct - 2. Number Six
		System.out.println("\ntask05 - language construct - Number Six");
		task05LanguageConstruct.NumberSix(5, 8);

		// task05 - language construct - 3. Tea Party
		System.out.println("\ntask05 - language construct - Tea Party");
		task05LanguageConstruct.teaParty(3, 8);// should be 0
		task05LanguageConstruct.teaParty(6, 8);// should be 1
		task05LanguageConstruct.teaParty(20, 6);// should be 2

		// task05 - language construct - 4. Lottery ticket
		System.out.println("\ntask05 - language construct - Lottery ticket");
//		task05LanguageConstruct.blueTicket(8, 4, 1);//should be 0
//		task05LanguageConstruct.blueTicket(13, 2, 3);//should be 5
//		task05LanguageConstruct.blueTicket(5, 15, 5);//should be 10
		System.out.println(task05LanguageConstruct.blueTicket(8, 4, 1));
		System.out.println(task05LanguageConstruct.blueTicket(13, 2, 3));
		System.out.println(task05LanguageConstruct.blueTicket(5, 15, 5));

		// task05 - language construct - 5. In Order
		System.out.println("\ntask05 - language construct - In Order");
		System.out.println(task05LanguageConstruct.inOrder(1, 1, 4, false));
		System.out.println(task05LanguageConstruct.inOrder(1, 2, 5, false));
		System.out.println(task05LanguageConstruct.inOrder(1, 1, 2, true));

		// task05 - language construct - 6. Share Digit
		System.out.println("\ntask05 - language construct - Share Digit");
		System.out.println(task05LanguageConstruct.shareDigit(11, 11));

		// task05 - language construct - 7. Sum Limit
		System.out.println("\ntask05 - language construct - Sum Limit");
		System.out.println(task05LanguageConstruct.sumLimit(4, 6));

		// task05 - language construct - 8. Sum Limit
		System.out.println("\ntask05 - language construct - Without String");
		System.out.println(task05LanguageConstruct.withoutString("THIS is a FISHaXaXa", "aXa"));
		System.out.println(task05LanguageConstruct.withoutString("Hi HoHo", "Ho"));

		// task05 - language construct - 9. Max Block
		System.out.println("\ntask05 - language construct - Max Block");
		System.out.println("Max Block size: Exp:" + (2) + "; Actual: " + task05LanguageConstruct.maxBlock("xyzz"));
		System.out.println(
				"Max Block size: Exp:" + (4) + "; Actual: " + task05LanguageConstruct.maxBlock("XXBBBbbxxXXXX"));
		System.out.println("Max Block size: Exp:" + (1) + "; Actual: " + task05LanguageConstruct.maxBlock("X"));
		System.out.println("Max Block size: Exp:" + (0) + "; Actual: " + task05LanguageConstruct.maxBlock(""));

		// task05 - language construct - 10. Sum Numbers
		System.out.println("\ntask05 - language construct - Sum Numbers");
		System.out.println(task05LanguageConstruct.sumNumbers("aa11b33"));// --> 44
		System.out.println(task05LanguageConstruct.sumNumbers("abc123x345yz111iurwe10000"));// --> 10579
		System.out.println(task05LanguageConstruct.sumNumbers("5$$1;;1!!"));// --> 7
		System.out.println(task05LanguageConstruct.sumNumbers("hdjekhdkj"));// --> 0
		System.out.println(task05LanguageConstruct.sumNumbers(""));// --> 0

	}

}
