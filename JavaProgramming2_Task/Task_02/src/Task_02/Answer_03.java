package Task_02;

import java.util.Scanner;

public class Answer_03 {
	static boolean search(int[] arr, int number) {
		boolean a = true;
		if(arr[number] == 1) {
			return a;
		}else {
			a = false;
			return a;
		}
	}
	
	static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + ":" + arr[i] + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] seat = { 0, 0, 1, 0, 1, 1, 0, 0, 1, 0 }; // 1:����� �¼�, 0:���డ���� �¼�
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("�¼� ��ȣ�� �Է��ϼ���(����� 0) >> ");
			int number = in.nextInt();
			if(number <= 0)
				break;
			if (search(seat, number - 1))  
				System.out.println("���� �Ϸ�");
			else
				System.out.println("���� �Ұ� : ����� �¼�");

			System.out.println("---------- ���� ��Ȳ -----------");
			display(seat);
		}
	}
}
