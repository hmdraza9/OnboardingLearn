package test.epam.runnertask06;

import test.epam.task06.Task06LoopsArray;
import test.util.classes.Utils;

public class RunnerClass {

	public static void main(String[] args) {

		System.out.println("Now: " + Utils.getTime());

		int[] numAr = new int[] { 1, 4, 2, 1, 4, 4, 4 };

		Task06LoopsArray.maxSpan(numAr);

	}

}
