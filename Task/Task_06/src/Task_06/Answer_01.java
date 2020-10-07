package Task_06;

import java.util.Scanner;

abstract class Shape{
	abstract double area();
	abstract void write();
}

class Circle extends Shape{
	static final double PI = 3.14;
	double r;
	public Circle(double r) {
		this.r = r;
	}
	double area() {
		return r * r * PI;
	}
	void write() {
		System.out.print("Circle [반지름 = " + r);
		System.out.printf("\t넓이 = %.2f ]\n", area());
	}
}

class Rectangle extends Shape {
	private double d1, d2;
	public Rectangle(double d1, double d2) {
		this.d1=d1;
		this.d2=d2;
	}
	  
	double area() { 
		return d1 * d2; 
	  }
	  
	void write() {
	    System.out.print("Rectangle[가로="+d1+"\t세로="+ d2);
	    System.out.printf("\t넓이 = %.2f ]\n", area());
	  	}
	}

public class Answer_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Shape[] sh = new Shape[10]; //다형성
		int index = 0;
		
		while(true) {
			System.out.print("1.원넓이 2.사각형넓이 3.종료 >> ");
			int num = in.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("반지름 입력 : ");
				double radius = in.nextDouble();
				sh[index++] = new Circle(radius); //circle이 shape로 자동형변환
				continue;
			
			case 2:
				System.out.print("가로 입력 : ");
				double d1 = in.nextDouble();
				System.out.print("세로 입력 : ");
				double d2 = in.nextDouble();
				sh[index++] = new Rectangle(d1, d2); //rectangle이 shape로 자동형변환
				continue;
				
			case 3 :
				for (int i = 0; i < index; i++) {
					sh[i].write();
					System.out.println("프로그램 종료");
				}
				break;
			}
			break;
		}
	}
}


//메소드 매개변수의 다형성 : 자식클래스의 객체를 매개변수로 받을 수 있다.