package Lec;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"java", "C++", "C#", "C++"};
		for(String a : sample)
			if(!s.add(a)) // 중복되는 단어는 hashset에 저장되지 않으며 false 반환
				System.out.println("중복된 단어 ==> " + a);
		System.out.println("HashSet에 저장된 단어 개수 : " + s.size());
		System.out.println("중복되지 않은 단어 : " + s);
		
		List vector = new Vector();
	}
}
