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
			if(!s.add(a)) // �ߺ��Ǵ� �ܾ�� hashset�� ������� ������ false ��ȯ
				System.out.println("�ߺ��� �ܾ� ==> " + a);
		System.out.println("HashSet�� ����� �ܾ� ���� : " + s.size());
		System.out.println("�ߺ����� ���� �ܾ� : " + s);
		
		List vector = new Vector();
	}
}
