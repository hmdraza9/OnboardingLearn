package test.epam.runners;

import test.epam.task06.Task06LoopsArray;

public class Task06LoopsArrayRunner {

	public static void main(String[] args) {

		Task06LoopsArray.maxSpan(new int[] { 1, 2, 1, 1, 3 });
		Task06LoopsArray.maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 });
		Task06LoopsArray.maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 });
		System.out.println("Can be balanced? " + Task06LoopsArray.canBalance(new int[] { 1, 1, 1, 1, 2, 1, 1 }));
		System.out.println("Lumps? " + Task06LoopsArray.countClumps(new int[] { 1, 2, 2, 3, 4, 4 }));
		System.out.println("Max mirror size: " + Task06LoopsArray.maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2, 1 }));
		System.out.println("Linear In: "
				+ (Task06LoopsArray.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { -1, 0, 3, 12 })));

	}

}
