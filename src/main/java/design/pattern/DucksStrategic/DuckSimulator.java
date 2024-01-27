package design.pattern.DucksStrategic;

public class DuckSimulator {

	public static void main(String[] args) {

		Duck customDuck = new IndianDuck();
		customDuck.display();
		customDuck.performFly();
		customDuck.performQuack();

	}

}
