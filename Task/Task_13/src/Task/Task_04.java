package Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person{
	private String name;
	private String num;
	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}
	
	public String toString() {
		return " [이름 : " + name + ",  전화번호 : " + num +"]" ;
	}
}

public class Task_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Person> map = new HashMap<>();
		
		map.put("first", new Person("강ㅇㅇ", "01098041304"));
		map.put("second", new Person("홍ㅇㅇ", "01012341234"));
		map.put("third", new Person("김ㅇㅇ", "01021212323"));
		map.put("fourth", new Person("이ㅇㅇ", "01036251727"));
		map.put("fifth", new Person("박ㅇㅇ", "01037164782"));
		
		int cnt = 0;
		while(cnt < 5) {
			System.out.print("입력 : ");
			System.out.println(map.get(sc.next()));
			cnt++;
		}
		
		System.out.println("\n-----모든 데이터 출력-----");
		for(Map.Entry<String, Person> s : map.entrySet()) {
			String key = s.getKey();
			Person value = s.getValue();
			System.out.println("key : " + key + ", value : " + value);
		}
	}
}
