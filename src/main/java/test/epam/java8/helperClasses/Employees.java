package test.epam.java8.helperClasses;

public class Employees {
	private String name;
	private String account;
	private String salary;

	public Employees(String name) {
		this.name = name;
	}

	public Employees(String name, String account, String salary) {
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}