package Task;

import java.util.*;

public class Task_01{
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i <= 10; i++) {
			int num = (int)(Math.random()*90) + 10;
			set.add(num);
		}
		
		System.out.println(set);
	}
}