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
//					System.out.println("nums[i]: " + nums[i] + " nums[j]: " + nums[j] + " Local span: " + temp
//							+ "; Max Span: " + span);
				}
//				else
//					System.out.println("nums[i]: " + nums[i] + " nums[j]: " + nums[j] + " Local span: " + temp
//							+ "; Max Span: " + span);

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
}