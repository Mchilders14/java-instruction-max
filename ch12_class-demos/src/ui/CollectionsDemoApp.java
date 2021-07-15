package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		List<String> names = new ArrayList<>();
		
		names.add("Matt");
		names.add("Nick");
		names.add("Seth");
		names.add("Linda");
		names.add("Michelle");
		names.add("Dylan");
		names.add("Sean");
		
		System.out.println(names);
		System.out.println("");
		
		for (String s : names) {
			System.out.println(s);
		}
		
		names.add(3, "Kevin");
		
		System.out.println(names);
		
		System.out.println("names size: " + names.size());
		
		System.out.println("get the fifth position: " + names.get(5));
		
		System.out.println("names size: " + names.size());

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(7);
		numbers.add(4);
		numbers.add(2);
		numbers.add(9);
		
		System.out.println(numbers);
		
		System.out.println("names contains Kevin?: " + names.contains("Kevin"));
		System.out.println("Kevin's Index: " + names.indexOf("Kevin"));
		System.out.println("Replace Kevin!: " + names.set(3, "Newbie"));
		System.out.println(names);
		
		names.add("Test");
		
		System.out.println(names);
		
		names.remove(names.size()-1);
		
		System.out.println(names);
		
		names.remove("Newbie");
		
		System.out.println(names);
		
		System.out.println("\nSort the list\n");
		
		Collections.sort(names);
		
		System.out.println("Sorted List: " + names);
		
		



	}

}
