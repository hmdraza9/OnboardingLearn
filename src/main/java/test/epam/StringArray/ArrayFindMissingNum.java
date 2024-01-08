package test.epam.StringArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayFindMissingNum {

	public static void findMissNumber(int min, int max, int removeNum) {

		List<Integer> numList = ArrayFindMissingNum.prepTestData(min, max, removeNum);

		for (int i = 0; i < numList.size() - 1; i++) {
			System.out.print("Checking: " + numList.get(i)+"\t");
			if (numList.get(i+1) - numList.get(i) > 1) {
				System.out.print("\nMissing number is: " + (numList.get(i) + 1));
				break;
			}
		}

	}

	private static List<Integer> prepTestData(int min, int max, int removeNum) {
		List<Integer> numList = new ArrayList<>();

		for (int i = min; i <= max; i++) {
			numList.add(i);
		}

		numList.remove(numList.indexOf(removeNum));

		return numList;
	}

}
