package test.epam.task02;

import test.epam.loggingANDloops.LooperClass;
import test.epam.loggingANDloops.TestLogging;

public class RunnerClass {

	public static void main(String[] args) {

		// Part 1
		System.out.println("***Printing Console input");
		ParamFromConsole.printName();
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

	}

}
