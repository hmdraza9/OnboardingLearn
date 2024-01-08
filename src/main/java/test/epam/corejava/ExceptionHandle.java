package test.epam.corejava;

public class ExceptionHandle {

	public static void exceptionHandleMethod() {

		try {
			System.out.println("I am inside exception handled!");
			System.out.println(1 / 0);
		} catch (ArithmeticException aa) {

		}

		System.out.println("I am standing after the exception handled!");

		System.out.println(1 / 0);

		System.out.println("I am standing after the exception not handled!");

	}

}
