package test.epam.power;

public class Fan extends Home {

	private float unit = 1;

	private String make = "USHA";

	public Fan(int unit, String make, int age) {
		super(age);
		this.unit = unit;
		this.make = make;
	}

	public float getUnit() {
		return unit;
	}

	public void setUnit(float unit) {
		this.unit = unit;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
