package test.epam.java8.helperClasses;

public class Employee {

	private String name;

	private String account;
	private double salary;

	public Employee(String name, String account, double salary) {
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public Employee() {
		System.out.println("Empty constructor called.");
	}

	@Override
	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", account=" + account + ", salary='" + salary + '\'' + '}';
	}

	public String getName() {
		return name;
	}

	public String getAccount() {
		return account;
	}

	public double getSalary() {
		return salary;
	}

}
