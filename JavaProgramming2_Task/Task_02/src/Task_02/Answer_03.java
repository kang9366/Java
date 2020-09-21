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
		int[] seat = { 0, 0, 1, 0, 1, 1, 0, 0, 1, 0 }; // 1:예약된 좌석, 0:예약가능한 좌석
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("좌석 번호를 입력하세요(종료는 0) >> ");
			int number = in.nextInt();
			if(number <= 0)
				break;
			if (search(seat, number - 1))  
				System.out.println("예약 완료");
			else
				System.out.println("예약 불가 : 예약된 좌석");

			System.out.println("---------- 예약 현황 -----------");
			display(seat);
		}
	}
}
