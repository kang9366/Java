package Lec;

import java.util.*;

public class WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "pro"};
		for(String a : sample) {
			Integer freq = m.get(a);
			m.put(a,  (freq == null) ? 1 : freq + 1);
		}
		System.out.println(m.size() + "개 단어가 있습니다.");
		System.out.println(m.containsKey("to")); // 해당 키가 존재하면 true 없으면 false 반환
		System.out.println(m.isEmpty()); // 해쉬맵이 비어있으면 true
		System.out.println(m); // 해쉬맵에 있는 모든 데이터 출
	}
}
