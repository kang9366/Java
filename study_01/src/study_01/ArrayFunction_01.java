package study_01;

import java.util.Scanner;

public class ArrayFunction_01 {
	static void init(int[] arg) {
		int cnt = 0;
		for (int i = 0; i < arg.length; i++) {
			arg[i] = ++cnt;
			System.out.print(arg[i] + "\t");
		}
	}
	
	static void reverse(int[] arg) {
		for(int i = arg.length-1; i >= 0; i--) {
			System.out.print(arg[i] + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int size = in.nextInt();
		
		int[] dim = new int[size];
		
		init(dim);
		System.out.println();
		reverse(dim);
	}
}
