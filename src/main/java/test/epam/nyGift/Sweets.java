package test.epam.nyGift;

public class Sweets extends Confectionery {

	private String flavour;

	public Sweets(String name, double weight, String flavour) {
		super(name, weight);
		this.flavour = flavour;
	}

	public String getFlavour() {
		return flavour;
	}

}
