package test.epam.java8;

import test.epam.java8.helperClasses.Employees;

public class Task07ConstructorReference {
	public static void mainConstructorReferenceTest() {

		MyInterface myInterface = Employees::new;
		System.out.println("Name: " + myInterface.send("Nick", "DBS", "23456").getName());
		System.out.println("Account: " + myInterface.send("Nick", "DBS", "23456").getAccount());
		System.out.println("Salary: " + myInterface.send("Nick", "DBS", "23456").getSalary());

	}
}

@FunctionalInterface
interface MyInterface {
	Employees send(String name, String account, String salary);
}