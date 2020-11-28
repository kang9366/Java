package Lec;

import java.util.LinkedList;

public class LinkedLIstTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");
		list.add(2, "GRAPE");
		list.remove(3);
		for(String temp : list)
			System.out.println(temp);
	}
}
