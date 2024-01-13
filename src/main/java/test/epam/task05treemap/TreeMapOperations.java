package test.epam.task05treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		for (int t = 0; t < testCases; t++) {
			int queries = scanner.nextInt();
			TreeMap<Integer, Integer> treeMap = new TreeMap<>();

			for (int q = 0; q < queries; q++) {
				char queryType = scanner.next().charAt(0);

				switch (queryType) {
				case 'a':
					int x = scanner.nextInt();
					int y = scanner.nextInt();
					treeMap.put(x, y);
					break;
				case 'b':
					int keyToPrint = scanner.nextInt();
					System.out.println(treeMap.getOrDefault(keyToPrint, -1));
					break;
				case 'c':
					System.out.println(treeMap.size());
					break;
				case 'd':
					int keyToRemove = scanner.nextInt();
					treeMap.remove(keyToRemove);
					break;
				case 'e':
					for (int key : treeMap.keySet()) {
						System.out.println(key + " " + treeMap.get(key));
					}
					break;
				}
			}
		}
		scanner.close();
	}
}