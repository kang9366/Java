package Task;

import java.util.Scanner;

public class Task_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.next();
			if(str.equals("finish")) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}else{
				System.out.println((new StringBuffer(str)).reverse().toString());
			}
		}
	}
}