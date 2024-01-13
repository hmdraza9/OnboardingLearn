package test.epam.task04;

import java.util.HashMap;
import java.util.Stack;

public class task04Class {

	public static boolean ParenthesesBalanced(String str) {
		boolean isBalanced = false;
		int sumBrackets = 0;

		HashMap<String, Integer> bracketMap = new HashMap<String, Integer>();

		bracketMap.put("[", 1);
		bracketMap.put("]", -1);
		bracketMap.put("{", 1);
		bracketMap.put("}", -1);
		bracketMap.put("(", 1);
		bracketMap.put(")", -1);

		Stack<String> stc = new Stack<String>();

		String[] strArr = str.split("");

		for (int m = 0; m < strArr.length; m++) {
			if (bracketMap.containsKey(strArr[m])) {
				stc.add(strArr[m]);
				sumBrackets = sumBrackets + bracketMap.get(strArr[m]);
			}
		}

		isBalanced = (sumBrackets == 0);

		return isBalanced;
	}

}
