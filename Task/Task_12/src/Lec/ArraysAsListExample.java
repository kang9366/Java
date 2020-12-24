package Lec;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "홍길동");
		for(String temp : list)
			System.out.println(temp);
		System.out.println("홍길동 객체 위치 : " + list.indexOf("홍길동"));
		System.out.println("홍길동 객체 위치 : " + list.lastIndexOf("홍길동"));
		
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
		for(int temp : list2)
			System.out.println(temp);
	}
}