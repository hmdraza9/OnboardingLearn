package test.epam.nyGift;

public class Confectionery implements Comparable<Confectionery> {

	private String name;
	private double weight;

	public Confectionery(String name, double weight) {

		this.name = name;
		this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Confectionery st) {
//		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		if (weight == st.weight)
			return 0;
		if (weight > st.weight)
			return 1;
		else
			return -1;
	}

}
