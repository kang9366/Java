package Task;

import java.util.Scanner;

public class Task_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= "�ڹ� ���α׷��� ��� �����ϴ�. ��ƽ��ϴ�";
		System.out.print("���ڸ� �Է��ϼ��� >>>> ");
		char ch = sc.next().charAt(0);
		int index = str.indexOf(ch);
		try {
			System.out.println(str.charAt(index) + "(��)�� " + (index+1) + "�� °�� �ֽ��ϴ�.");
			System.exit(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(ch + "�� �ش� ���ڿ��� �����ϴ�.");
			System.exit(-1);
		}
	}
}