package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class CompleteNum {
	static ArrayList<Integer> divisor(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if(num%i == 0) {
				list.add(i);
			}
		}
		return list;
	}
	
	static void compeleteNum(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size()-1; i++) {
			sum += list.get(i);
		}
		if(sum==list.get(list.size()-1)) {
			System.out.println(list.get(list.size()-1) + " is complete number");
		}else {
			System.out.println(list.get(list.size()-1) + " is not complete number");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("If you input 0 or 1, It'll stop");
		int num = 0;
		while(true) {
			System.out.print("Input Number : ");
			num = sc.nextInt();
			if (num==0 || num==1) {
				System.out.println("Stop");
				break;
			}else {
				list = divisor(num);
				compeleteNum(list);
			}
		}
	}
}
