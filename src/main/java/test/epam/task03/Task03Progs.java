package test.epam.task03;

import java.util.HashMap;
import java.util.Scanner;

public class Task03Progs {

	public static void MapPhoneBook() {

		HashMap<String, Integer> numBook = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("What you want to do?" + "\n1. Save a contact" + "\n2. View a contact" + "\n3. Exit");

		int optionSelected = sc.nextInt();

		System.out.println("Option sleceted: " + optionSelected);

		while (optionSelected == 1 || optionSelected == 2) {
			switch (optionSelected) {

			case 1:
				System.out.println("Enter count of contact details you want to save:\n");
				int contactCount = sc.nextInt();
				while (contactCount > 0) {
					System.out.println("Contacts to be saved: " + contactCount);
					System.out.println("Enter name and phone in separate new line\n");
					String name = sc.next();
					int phone = sc.nextInt();
					numBook.put(name, phone);
					System.out.println("Saved contact, name: " + name + ", phone: " + phone);
					contactCount--;
				}
				System.out
						.println("What you want to do?" + "\n1. Save a contact" + "\n2. View a contact" + "\n3. Exit");
				optionSelected = sc.nextInt();
				break;
			case 2:
				System.out.println("Enter name of the contact\n");
				String fetchName = sc.next();
				System.out.println("Fetching contact: " + fetchName);
				if (numBook.containsKey(fetchName)) {
					System.out.println(fetchName + "=" + numBook.get(fetchName));
				} else
					System.out.println("Not found");
				System.out
						.println("What you want to do?" + "\n1. Save a contact" + "\n2. View a contact" + "\n3. Exit");
				optionSelected = sc.nextInt();

			case 3:
				System.out.println("Exitting...");
				break;
			default:
				break;

			}
		}

	}

}