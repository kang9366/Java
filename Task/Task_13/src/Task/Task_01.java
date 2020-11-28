package Task;

import java.util.HashSet;
import java.util.Random;

public class Task_01{
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i <= 10; i++) {
			int ran = (int)(Math.random()*90) + 10;
			set.add(ran);
		}
		System.out.println(set.toString());
	}
}