package test.epam.task06;

public class Task06LoopsArray {

	public static void maxSpan(int[] nums) {
		int span = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				int temp = 0;

				if (nums[i] == nums[j]) {
					temp = j - i + 1;
					span = Math.max(span, temp);
				}

			}
		}

		System.out.println("Span: " + span);

	}

	public static boolean canBalance(int[] nums) {

		int lSum = 0;
		int rSum = 0;
		boolean isBalanced = false;
		int balancedPoint = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int m = 0; m <= i; m++) {

				lSum = lSum + nums[m];

			}

			for (int m = (i + 1); m < nums.length; m++) {

				rSum = rSum + nums[m];

			}

			isBalanced = (lSum == rSum);
			System.out.println("L Sum: " + lSum + ", R Sum: " + rSum);
			balancedPoint = i;

			if (isBalanced) {
				System.out.print("At i=" + balancedPoint + "  ");
				break;
			}
			lSum = 0;
			rSum = 0;
		}
		return isBalanced;

	}

	public static int countClumps(int[] numArray) {

		int lumpCount = 0;
		int prevInt = -1;

		for (int i = 0; i < numArray.length - 1; i++) {
			int temp = numArray[i + 1];
			if (numArray[i] == temp && numArray[i] != prevInt) {

				System.out.println("Lump detected: " + numArray[i] + " : " + temp);
				lumpCount++;
				prevInt = numArray[i];

			}

			prevInt = numArray[i];
		}
		return lumpCount;
	}

	public static int maxMirror(int[] nums) {

		int len = nums.length;
		int count = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = len - 1; i + count < len && j > -1; j--) {
				if (nums[i + count] == nums[j]) {
					count++;
				} else {
					if (count > 0) {
						max = Math.max(count, max);
						count = 0;
					}
				}
			}
			max = Math.max(count, max);
		}
		return max;
	}

	public static boolean linearIn(int[] numArray, int[] subNumArray) {

		int[] tempArray = new int[subNumArray.length];

		boolean isLinearIn = true;

		for (int i = 0; i < numArray.length - tempArray.length + 1; i++) {
			for (int m = 0; m < (tempArray.length); m++) {
				tempArray[m] = numArray[m + i];
			}
//			System.out.println("i= " + i + " tempArray size: " + tempArray.length);
			System.out.print("Sub array : ");
			printArray(subNumArray);
			System.out.print("Temp array: ");
			printArray(tempArray);
			System.out.println("Is match? " + (tempArray == subNumArray));

			for (int k = 0; k < tempArray.length; k++) {

				isLinearIn = tempArray[k] == subNumArray[k];

				if (!isLinearIn)
					break;

			}
			System.out.println("Is match? " + isLinearIn);
			if (isLinearIn)
				break;

		}
		return isLinearIn;

	}

	private static void printArray(int[] arrAy) {
//		System.out.println("Printing Array:");
		for (int t : arrAy) {
			System.out.print(t + " ");
		}
		System.out.println("");
	}
}