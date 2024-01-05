package test.epam.power;

public class Light extends Home {

	private float unit = .2f;

	private String make = "Philips";

	public Light(float unit, String make, int age) {
		super(age);
		this.unit = unit;
		this.make = make;
	}

	public float getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
}
