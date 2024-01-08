package test.epam.StringArray;

public class StringWordIsRotation {

	public static void stringIsRotation(String str, String target) {

//		str = "hello";
//		target = "lohel";
		boolean isRot;

		if ((str.length() == target.length())) {
			isRot = (str + str).indexOf(target) != (-1);
			if (isRot) {
				System.out.println("Strings are rotatable");
			} else
				System.out.println("Strings are NOT rotatable");
		} else
			System.out.println("Strings are NOT rotatable as lengths are different");
	}

}
