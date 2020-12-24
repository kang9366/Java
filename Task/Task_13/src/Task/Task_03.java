package Task;

import java.util.*;

class Count{
	public static Map<Integer, Integer> count() {
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] num = new int[100];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random()*6) + 1;
		}
		
		for(int i = 0; i < num.length; i++) {
			Integer freq = map.get(num[i]);
			map.put(num[i], (freq==null)?1:freq+1);
		}
		return map;
	}
	
	public static void write(Map<Integer, Integer> map) {
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.printf("주사위 눈 = " +   m.getKey() + " 빈도수 = " + m.getValue() + "\n");
		}
	}
}

public class Task_03{
	public static void main(String[] args) {
		Map<Integer, Integer> map;
		map = Count.count();
		System.out.println(map);
		System.out.println("Map에 저장된 빈도수를 출력합니다.");
		Count.write(map);
	}
}