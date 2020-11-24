package Task_04;

import java.util.Scanner;

class Person {
	//공통되는 필드
	private String name;
	private int id;

	//공통되는 메소드
	public int computeSalary() {
		return 1;
	}
	
	//생성자
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//toString
	@Override
	public String toString() {
		return "사번 : " + id + ", 이름 : " + name ;
	}
}

class SalariedEmployee extends Person {	//Person 클래스 상속
	//필드 추가
	private int salary;
	
	//자식클래스 생성자
	public SalariedEmployee(String name, int id, int salary) {
		super(name, id);
		this.salary = salary;
	}
	
	// computeSalary() 메소드 재정의
	@Override
	public int computeSalary() {
		return salary * 12;
	}
	
	// toString() 메소드 재정의
	@Override
	public String toString() {
		return super.toString() + ", 급여 : " + salary + ", 연봉 : " + computeSalary();
	}
}

class HourEmployee extends Person {
	//필드 추가
	private int money;
	private int hour;
	
	//자식클래스 생성자
	public HourEmployee(String name, int id, int money, int hour) {
		super(name, id);
		this.money = money;
		this.hour = hour;
	}
	
	// computeSalary() 메소드 재정의
	@Override
	public int computeSalary() {
		return money * hour;
	}
	
	// toString() 메소드 재정의
	@Override
	public String toString() {
		return super.toString() + ", 시간당 임금 : " + money + ", 일한시간 : " + hour + ", 금액 : " + computeSalary();
	}
}

public class Answer_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Person[] person = new Person[100];
		boolean flag = true;
		int num = 0;
		
		while (flag) {
			System.out.print("1: Salaried 객체 생성, 2: Hour 객체 생성 3. 종료 --> ");
			int menu = in.nextInt();
			switch (menu) {
			case 1:
				System.out.println("이름, 사번, 급여를 입력하세요");
				//본인 작성
				person[num] = new SalariedEmployee(in.next(), in.nextInt(), in.nextInt());
				num++;
				break;
			case 2:
				//본인 작성
				System.out.println("이름, 사번, 시간당임금, 시간을 입력하세요");
				person[num] = new HourEmployee(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
				num++;
				break;
			case 3:
				System.out.println("\n--------전체 레코드 출력--------");
				for (int i = 0; i < num; i++) {
					System.out.println(person[i]);
				}
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}