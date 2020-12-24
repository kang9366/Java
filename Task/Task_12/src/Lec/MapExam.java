package Lec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student{
	private int number;
	private String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class MapExam {
	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(201, new Student(201, "펭수"));
		map.put(202, new Student(202, "펭하"));
		map.put(203, new Student(203, "펭바"));
		map.put(202, new Student(202, "펭성")); //똑같은 키 값이 있으면 마지막 저장한 값으로 대
		map.put(204, new Student(204, "펭수1"));
		
		System.out.println(map.get(201)); //키 값에 해당하는 value 반환
		
		System.out.println("----keySet으로 모든 키 얻기----");
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> keytor = keyset.iterator();
		while(keytor.hasNext()) {
			Integer key = keytor.next();
			Student value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
		
		map.remove(204); //하나의 항목 삭제
		System.out.println("----entrySet()으로 Map.Entry 객체 얻기----");
		for(Map.Entry<Integer, Student> s : map.entrySet()) {
			Integer key = s.getKey();
			Student value = s.getValue();
			System.out.println("key : " + key + ", value : " + value);
		}
		
		System.out.println("----람다식으로 출력----");
		map.forEach((key, value) -> {
			System.out.println("key : " + key + ", value : " + value);
		});
	}
}
