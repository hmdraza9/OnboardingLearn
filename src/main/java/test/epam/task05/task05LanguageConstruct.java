package test.epam.task05;

public class task05LanguageConstruct {

	public static void caughtSpeeding(int speed, boolean isBirthday) {

		int returnCode = -1;

		if (isBirthday) {
			speed = speed - 5;
		}

		if (speed < 61) {
			returnCode = 0;
		} else if (speed > 60 && speed <= 80) {
			returnCode = 1;
		} else if (speed > 80) {
			returnCode = 2;
		}

		System.out.println("Ticket code: " + returnCode);
	}

	public static void NumberSix(int a, int b) {

		boolean returnValue = (a == 6 || b == 6 || (a + b) == 6 || Math.abs((a - b)) == 6);
		System.out.println("Number six: " + returnValue);

	}

	public static void teaParty(int tea, int candy) {

		int returnCode = -1;

		if ((tea < 5) || (candy < 5))
			returnCode = 0;

		if ((tea >= 5) && (candy >= 5))
			returnCode = 1;

		if ((tea >= 5 && candy >= 5) && (tea >= 2 * candy || candy >= 2 * tea))
			returnCode = 2;

		System.out.println("Party feedback: " + returnCode);
	}

	public static int blueTicket(int a, int b, int c) {

		int retVal = -1;

		int abSum = a + b;
		int bcSum = b + c;
		int acSum = a + c;

		if (abSum == 10 || bcSum == 10 || acSum == 10) {
//			System.out.print(10 + " ");
			retVal = 10;
			return 10;
		}

		if ((a + b) == (acSum + 10) || (a + b) == (bcSum + 10)) {
//			System.out.print(5 + " ");
			retVal = 5;
			return 5;
		} else {
//			System.out.print(0 + " ");
			retVal = 0;
			return 0;
		}
//		return retVal;
	}

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (b < c) {
			if (!bOk && a < b) {
				return true;
			} else if (bOk && a < c) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean shareDigit(int a, int b) {

		boolean isSharing = false;

		if ((a / 10 > 0) && (b / 10 > 0)) {// 23 62

			isSharing = (a / 10) == (b / 10) || (a / 10) == (b % 10) || (a % 10) == (b / 10) || (a % 10) == (b % 10);

		}

		return isSharing;

	}

	public static int sumLimit(int a, int b) {

		int toReturn = 1;

		if (String.valueOf((a + b)).length() > String.valueOf(a).length()) {
			toReturn = a;
		} else
			toReturn = (a + b);

		return toReturn;
	}

	public static String withoutString(String base, String remove) {

		String toReturn = "";

		if (base.contains(remove)) {
			toReturn = base.replaceAll(remove, "");
		} else
			toReturn = "ERROR! - String doesn't contain string to remove";

		return toReturn;
	}

}