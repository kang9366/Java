package Lec;

import java.util.*;

public class ArrayList {
	public static void main(String[] args) {
		List<String> list = new java.util.ArrayList<String>();
		list.add("Milk");
		list.add("Bread");
		list.add("Butter");
		list.add(1, "Apple");
		list.add(2, "Grape");
		list.remove(3);
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}