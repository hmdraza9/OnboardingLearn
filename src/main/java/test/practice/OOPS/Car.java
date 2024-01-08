package test.practice.OOPS;

public class Car {

	private String color;
	private int noOfTyres;

	private Engine engine;

	public Car(String color, int noOfTyres, String engineType, String engineName, String enginePower) {


		this.color = color;
		this.noOfTyres = noOfTyres;
		this.engine = new Engine();

		engine.setEngineName(engineName);
		engine.setEngineType(engineType);
		engine.setEnginePower(enginePower);

	}

	public String getEngineName() {
		return engine.getEngineName();
	}

	public String getEngineType() {
		return engine.getEngineType();
	}

	public String getEnginePower() {
		return engine.getEnginePower();
	}

	public String getCarColor() {
		return color;
	}

	public int getCarNoOfTyres() {
		return noOfTyres;
	}

}
