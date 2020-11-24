package Task;

import java.util.Scanner;

public class Task_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= "자바 프로그램은 재미 없습니다. 어렵습니다";
		System.out.print("문자를 입력하세요 >>>> ");
		char ch = sc.next().charAt(0);
		int index = str.indexOf(ch);
		try {
			System.out.println(str.charAt(index) + "(은)는 " + (index+1) + "번 째에 있습니다.");
			System.exit(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(ch + "는 해당 문자열에 없습니다.");
			System.exit(-1);
		}
	}
}