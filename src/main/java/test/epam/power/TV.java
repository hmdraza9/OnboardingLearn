package test.epam.power;

public class TV extends Home {

	private float unit = .3f;

	private String make = "LG";

	public TV(float unit, String make, int age) {
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
