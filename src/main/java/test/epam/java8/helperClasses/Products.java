package test.epam.java8.helperClasses;

public class Products {

	public String name;
	public int price;
	public String category;
	public String grade;

	public Products(String name, int price, String category, String grade) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;
	}

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade='" + grade + '\'' +
				'}';
	}

}
