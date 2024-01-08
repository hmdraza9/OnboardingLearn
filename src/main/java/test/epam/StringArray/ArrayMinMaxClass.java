package test.epam.StringArray;

public class ArrayMinMaxClass {

	public static void minMaxMethod() {

		System.out.println("\n\n***minMaxMethod***");
		
		int[] numArr = new int[] { 588, 155, 328, 434, 556, 504, 537, 197 };

		int min = numArr[0];
		int max = 0;

		for (int i = 0; i < numArr.length; i++) {

			if (min > numArr[i])
				min = numArr[i];
			if (max < numArr[i])
				max = numArr[i];
		}

		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		

	}

}
