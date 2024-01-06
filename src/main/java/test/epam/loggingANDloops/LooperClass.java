package test.epam.loggingANDloops;

public class LooperClass {

	public static void usingWhileLoop(int height, int d) {

		System.out.println("\n\n usingWhileLoop");
		int i = 0, j = 0, counter = 0;

		while (i < height) {
			while (j <= i) {
				System.out.print(d * counter++ + "\t");
				j++;
			}
			System.out.println("");
			i++;
			j = 0;
		}

	}

	public static void usingDoWhileLoop(int height, int d) {

		System.out.println("\n\n usingDoWhileLoop");
		int i = 0, j = 0, counter = 0;

		do {
			{
				while (j <= i) {
					System.out.print(d * counter++ + "\t");
					j++;
				}
				System.out.println("");
				i++;
				j = 0;
			}
		} while (i < height);

	}

	public static void usingForLoop(int height, int d) {

		int counter = 0;

		System.out.println("\n\n usingForLoop");
		counter = 0;
		for (int m = 0; m < height; m++) {
			for (int n = 0; n <= m; n++) {
				System.out.print((d * counter++) + "\t");
			}
			System.out.println("");
		}

	}

}
