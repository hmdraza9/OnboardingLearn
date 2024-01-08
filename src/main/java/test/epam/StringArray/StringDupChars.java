package test.epam.StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDupChars {

	public static void findDupCharacters() {

		String str = "This is a test sentence";
		str = str.toLowerCase();

		System.out.println("Size : " + str.toLowerCase().replaceAll("\\s", "").split("").length);

		List<String> CharList = Arrays.asList(str.replaceAll("\\s", "").split(""));
		List<String> uniqueCharList = new ArrayList<String>();
		List<String> dupCharList = new ArrayList<String>();

	System.out.println("All characters	    : "+CharList);

		for (String strr : CharList) {
			if (uniqueCharList.contains(strr)) {
//				System.out.println("This char is duplicate: " + strr);
				dupCharList.add(strr);
			} else
				uniqueCharList.add(strr);
		}

		System.out.println("Duplicate characters: "+dupCharList);
		System.out.println("Unique characters   : "+uniqueCharList);

	}

}
