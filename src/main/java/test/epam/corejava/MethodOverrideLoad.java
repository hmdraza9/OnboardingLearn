package test.epam.corejava;

public class MethodOverrideLoad extends DummyClass {

	public void dummyMethod() {

		System.out.println("I am in dummy method overridden.");

	}

	public static void findArea(int l, int b) {

		System.out.println("Area: " + (l * b) + " sqmtr");
	}

	public static void findArea(int side) {

		System.out.println("Area: " + (side * side) + " sqmtr");
	}

	public static DummyClass dclsStatic = new DummyClass();
	public DummyClass dclsNonStatic = new DummyClass();

}
