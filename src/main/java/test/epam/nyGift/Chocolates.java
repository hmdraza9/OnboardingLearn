package test.epam.nyGift;

public class Chocolates extends Confectionery {

	private String type;

	public Chocolates(String name, double weight, String type) {
		super(name, weight);
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
