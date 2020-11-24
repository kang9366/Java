package Lec;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println((random.nextInt(100) + 1) + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("%.2f\t" + random.nextDouble());
		}
	}
}
