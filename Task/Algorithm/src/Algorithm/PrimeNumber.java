package Algorithm;

import java.util.Scanner;
import java.util.Vector;

public class PrimeNumber {
	public static void primeNumCalculator(int num[]) {
		Vector<Integer> primeNum = new Vector<Integer>();
		Vector<Integer> naturalNum = new Vector<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			boolean flag = true;
			for (int j = 2; j < num[i]; j++) {
				if(num[i]%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				primeNum.add(num[i]);
			}else {
				naturalNum.add(num[i]);
			}
		}
		System.out.println("소수 : " + primeNum);
		System.out.println("개수 : " + primeNum.size());
		System.out.println("소수x : "  + naturalNum);
		System.out.println("개수 : " + naturalNum.size());
	}
	
	public static void inputNum(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if(num%i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(num + "은 소수");
		}else {
			System.out.println(num + "은 소수 x");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[99];
		int cnt = 2;
		for (int i = 0; i < 99; i++) {
			num[i] = cnt;
			cnt++;
		}
		//primeNumCalculator(num);
		while(true) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			if(n==0 || n==1) {
				System.out.println("종료");
				break;
			}
			inputNum(n);
		}
	}
}