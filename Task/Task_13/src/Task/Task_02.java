package Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_02 {
	public static void main(String[] args) {
		String[] s = { "사과", "배", "바나나" };
		ArrayList list = new ArrayList(Arrays.asList(s));
		
		//1
		list.add("포도");
		
		//2
		list.add(2, "자몽");

		//3
		System.out.println("=========리스트 출력=========");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
		
		//4
		int index = 3;
		System.out.println("인덱스 " + index + " : " + list.get(index));
		
		//5
		list.set(2, "메론");
		
		//6
		list.add("배");
		
		//7
		System.out.println("배가 저장된 위치 : " + list.indexOf("배"));
		
		//8
		list.remove("바나나");
		
		//9
		System.out.println("=========리스트 출력=========");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================");
	}
}
