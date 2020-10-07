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
		System.out.print("Circle [������ = " + r);
		System.out.printf("\t���� = %.2f ]\n", area());
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
	    System.out.print("Rectangle[����="+d1+"\t����="+ d2);
	    System.out.printf("\t���� = %.2f ]\n", area());
	  	}
	}

public class Answer_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Shape[] sh = new Shape[10]; //������
		int index = 0;
		
		while(true) {
			System.out.print("1.������ 2.�簢������ 3.���� >> ");
			int num = in.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("������ �Է� : ");
				double radius = in.nextDouble();
				sh[index++] = new Circle(radius); //circle�� shape�� �ڵ�����ȯ
				continue;
			
			case 2:
				System.out.print("���� �Է� : ");
				double d1 = in.nextDouble();
				System.out.print("���� �Է� : ");
				double d2 = in.nextDouble();
				sh[index++] = new Rectangle(d1, d2); //rectangle�� shape�� �ڵ�����ȯ
				continue;
				
			case 3 :
				for (int i = 0; i < index; i++) {
					sh[i].write();
					System.out.println("���α׷� ����");
				}
				break;
			}
			break;
		}
	}
}


//�޼ҵ� �Ű������� ������ : �ڽ�Ŭ������ ��ü�� �Ű������� ���� �� �ִ�.