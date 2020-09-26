package Task_04;

import java.util.Scanner;

class Shape{
	public void draw(int x, char ch) {
		System.out.println("--------행크기 : " + x + "\t문자 : " + ch + "도형 그리기");
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
		System.out.print("행 크기를 입력하세요 : ");
		int size = in.nextInt();
		return size;
	}
	public static char input_ch() {
		System.out.print("문자를 입력하세요 : ");
		char ch = in.next().charAt(0);
		return ch;
	}

	public static void main(String[] args) {
		Shape shape = null;
		
		while(true) {
			System.out.println("1. Rectangle 2. Triangle 3. Finish");
			System.out.print("메뉴를 선택하세요 : ");
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
				System.out.println("==== 프로그램 종료 ====");
				break;
			}
			break;
			
		}
	}
}