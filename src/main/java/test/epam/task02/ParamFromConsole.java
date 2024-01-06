package test.epam.task02;

import java.util.Scanner;

public class ParamFromConsole {

	public static void printName() {

		System.out.println("Enter name:");

		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		System.out.println("Hello " + name);

		sc.close();

	}

	public static float calculator(int a, int b, String op) {

		float returnVal = 0;

		switch (op) {

		case "+":
			returnVal = (a + b);
			break;

		case "-":
			returnVal = (a - b);
			break;
		case "*":
			returnVal = a * b;
			break;
		case "/":
			if (b != 0) {
				returnVal = a / b;
			} else {
				returnVal = 0;
			}
			break;
		case "%":
			returnVal = a % b;
			break;
		case "percent":
			returnVal = (a*100)/b;

		}

		return returnVal;
	}

}
