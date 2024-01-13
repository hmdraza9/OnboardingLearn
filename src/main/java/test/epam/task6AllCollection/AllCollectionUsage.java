package test.epam.task6AllCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AllCollectionUsage {

	public static void main(String[] args) {

		AllCollectionUsage.season_List();
		AllCollectionUsage.trainCoach_LinkedList();
		AllCollectionUsage.logLevels_HashMap();
		AllCollectionUsage.weekDays_LinkedHashMap();
		AllCollectionUsage.diceSpace_HashSet();
		AllCollectionUsage.allWeekDays_LinkedHashSet();
		AllCollectionUsage.eduBoards_TreeSet();
		AllCollectionUsage.eduCourses_TreeMap();

	}

	public static void season_List() {

		// Array List

		List<String> seasonList = new ArrayList<String>();

		seasonList.add("Winter");
		seasonList.add("Spring");
		seasonList.add("Summer");
		seasonList.add("Autumn");
		seasonList.add("");
		seasonList.add("");
		System.out.println("[ArrayList] Seasons - insertion order: Winter Spring Summer Autumn \"\" \"\"");

		for (String str : seasonList) {
			System.out.print(str + "\t");
		}

		System.out.println("\n");
	}

	public static void trainCoach_LinkedList() {
		// Linked List

		LinkedList<String> linkListTrainCoach = new LinkedList<String>();

		linkListTrainCoach.add("3AC");
		linkListTrainCoach.add("2AC");
		linkListTrainCoach.addLast("");
		linkListTrainCoach.add("");
		linkListTrainCoach.add("1AC");
		linkListTrainCoach.addFirst("Sleeper");
		linkListTrainCoach.add("");

		System.out.println("[Linked List] Coach types: ");

		for (String strr : linkListTrainCoach) {
			System.out.print(strr + "\t");
		}
	}

	public static void logLevels_HashMap() {
		System.out.println("\n\n[Hash Map] Log Levels - insertion order: INFO ERROR WARN DEBUG null null");

		HashMap<String, Integer> logLevel = new HashMap<String, Integer>();

		logLevel.put("INFO", 1);
		logLevel.put("ERROR", 2);
		logLevel.put("WARN", 3);
		logLevel.put("DEBUG", 4);
		logLevel.put(null, null);
		logLevel.put(null, null);

		Iterator<Entry<String, Integer>> newMapIt = logLevel.entrySet().iterator();

		while (newMapIt.hasNext()) {
			Map.Entry<String, Integer> new_map = (Map.Entry<String, Integer>) newMapIt.next();
			System.out.println("Log type: " + new_map.getKey() + ",; value: " + new_map.getValue());
		}
	}

	public static void weekDays_LinkedHashMap() {
		System.out.println("\n\n[Linked Hash Map] Weekdays - insertion order: 6 3 3 4 5 5 2 null null");

		LinkedHashMap<Integer, String> weekDays = new LinkedHashMap<Integer, String>();

		weekDays.put(6, "Monday");
		weekDays.put(3, "Tuesday");
		weekDays.put(3, "Tuesday");
		weekDays.put(4, "Wednesday");
		weekDays.put(5, "");
		weekDays.put(5, "Thursday");
		weekDays.put(2, "Monday");
		weekDays.put(null, null);
		weekDays.put(null, null);

		Iterator<Entry<Integer, String>> newMapIte = weekDays.entrySet().iterator();

		while (newMapIte.hasNext()) {
			Map.Entry<Integer, String> new_map = (Map.Entry<Integer, String>) newMapIte.next();
			System.out.println("Week days: " + new_map.getKey() + ",; value: " + new_map.getValue());
		}
	}

	public static void diceSpace_HashSet() {
		System.out.println("\n\n[HashSet] Dice outcomes - insertion order: 5 2 6 4 1 3 null null 3");

		Set<Integer> diceSpaces = new HashSet<Integer>();

		diceSpaces.add(5);
		diceSpaces.add(2);
		diceSpaces.add(6);
		diceSpaces.add(4);
		diceSpaces.add(1);
		diceSpaces.add(3);
		diceSpaces.add(null);
		diceSpaces.add(null);
		diceSpaces.add(3);

		Iterator<Integer> diceIt = diceSpaces.iterator();

		while (diceIt.hasNext()) {
			System.out.print(diceIt.next() + "\t");
		}

	}

	public static void allWeekDays_LinkedHashSet() {

		System.out.println("\n\n[LinkedHashSet] All Week Days - insertion order: 5 2 7 6 null 4 1 null 3 null null 3");

		Set<Integer> allWeekDays = new LinkedHashSet<Integer>();

		allWeekDays.add(5);
		allWeekDays.add(2);
		allWeekDays.add(7);
		allWeekDays.add(6);
		allWeekDays.add(null);
		allWeekDays.add(4);
		allWeekDays.add(1);
		allWeekDays.add(null);
		allWeekDays.add(3);
		allWeekDays.add(null);
		allWeekDays.add(null);
		allWeekDays.add(3);

		Iterator<Integer> weekIt = allWeekDays.iterator();

		while (weekIt.hasNext()) {
			System.out.print(weekIt.next() + "\t");
		}

	}

	public static void eduBoards_TreeSet() {

		System.out.println("\n\n[TreeSet] Edu Boards - insertion order: CBSE ICSE null IB NIOS null ICSE AISSCE");

		Set<String> edBoardSet = new TreeSet<String>();

		edBoardSet.add("CBSE");
		edBoardSet.add("ICSE");
//		edBoardSet.add(null);//null not accepted
		edBoardSet.add("IB");
		edBoardSet.add("NIOS");
//		edBoardSet.add(null);
		edBoardSet.add("ICSE");
		edBoardSet.add("AISSE");

		Iterator<String> edBoardSetIt = edBoardSet.iterator();

		while (edBoardSetIt.hasNext()) {
			System.out.print(edBoardSetIt.next() + "\t");
		}

	}

	public static void eduCourses_TreeMap() {

		System.out.println("\n\n[TreeMap] Edu Courses - insertion order: BA MA MA null BCom BTech BTech MCom null BTech MTech");

		Map<String, Integer> eduCourses = new TreeMap<String, Integer>();

		eduCourses.put("BA", 3);
		eduCourses.put("MA", 2);
		eduCourses.put("MA", 2);
//		eduCourses.put(null, null);//null not accepted
		eduCourses.put("BCom", 3);
		eduCourses.put("BTech", 4);
		eduCourses.put("MCom", 2);
//		eduCourses.put(null, null);//null not accepted
		eduCourses.put("BTech", 4);
		eduCourses.put("MTech", 2);

		Iterator<Entry<String, Integer>> eduCoursesIt = eduCourses.entrySet().iterator();

		while (eduCoursesIt.hasNext()) {
			
			Map.Entry<String, Integer> new_map = (Map.Entry<String, Integer>)eduCoursesIt.next();
			System.out.print(new_map.getKey()+" "+new_map.getValue()+"\t");
		}

	}

}
