package Task_04;

import java.util.Scanner;

class Shape{
	public void draw(int x, char ch) {
		System.out.println("--------��ũ�� : " + x + "\t���� : " + ch + "���� �׸���");
	}
}

class Rectangle extends Shape {
	public void draw(int x, char ch) {
		super.draw(x, ch);
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

class Triangle extends Shape {
	public void draw(int x, char ch) {
		super.draw(x, ch);
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

public class Answer_02 {
	static Scanner in = new Scanner(System.in);
	
	public static int input_row() {
		System.out.print("�� ũ�⸦ �Է��ϼ��� : ");
		int size = in.nextInt();
		return size;
	}
	public static char input_ch() {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char ch = in.next().charAt(0);
		return ch;
	}

	public static void main(String[] args) {
		Shape shape = null;
		
		while(true) {
			System.out.println("1. Rectangle 2. Triangle 3. Finish");
			System.out.print("�޴��� �����ϼ��� : ");
			int num = in.nextInt();
			
			switch (num) {
			case 1:
				shape = new Rectangle();
				shape.draw(input_row(),  input_ch());
				continue;
			case 2:
				shape = new Triangle();
				shape.draw(input_row(), input_ch());
				continue;
			case 3:
				System.out.println("==== ���α׷� ���� ====");
				break;
			}
			break;
			
		}
	}
}