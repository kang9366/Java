package Task;

import java.util.Scanner;

public class Task_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			if(str.equals("finish")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}else{
				System.out.println((new StringBuffer(str)).reverse().toString());
			}
		}
	}
}