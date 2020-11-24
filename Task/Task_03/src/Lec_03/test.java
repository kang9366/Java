package Lec_03;

import java.util.Scanner;

class Circle{
	private static final double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return radius * radius * PI;
	}
	
	@Override
	public String toString() {
		return "Circle [radius = " + radius + ", area = " + area() + "]";
	}
}

class Rectangle{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public String toString() {
		return "Rectangle [width = " + width + "height = " + height + ", area = " + area() + "]";
	}
	
}

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �� ����   2. �簢�� ����   >>  ");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("������ ���� �Է�  >>  ");
			Circle c = new Circle(sc.nextDouble());
			System.out.println(c);
			System.out.println("���α׷� ����");
			break;
		case 2:
			System.out.println("���ο� ������ ���̸� ���������� �Է�  >>  ");
			Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
			System.out.println(r);
			System.out.println("���α׷� ����");
			break;
		}
	}
}
