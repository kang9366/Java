package Task_04;

import java.util.Scanner;

class Person {
	//����Ǵ� �ʵ�
	private String name;
	private int id;

	//����Ǵ� �޼ҵ�
	public int computeSalary() {
		return 1;
	}
	
	//������
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//toString
	@Override
	public String toString() {
		return "��� : " + id + ", �̸� : " + name ;
	}
}

class SalariedEmployee extends Person {	//Person Ŭ���� ���
	//�ʵ� �߰�
	private int salary;
	
	//�ڽ�Ŭ���� ������
	public SalariedEmployee(String name, int id, int salary) {
		super(name, id);
		this.salary = salary;
	}
	
	// computeSalary() �޼ҵ� ������
	@Override
	public int computeSalary() {
		return salary * 12;
	}
	
	// toString() �޼ҵ� ������
	@Override
	public String toString() {
		return super.toString() + ", �޿� : " + salary + ", ���� : " + computeSalary();
	}
}

class HourEmployee extends Person {
	//�ʵ� �߰�
	private int money;
	private int hour;
	
	//�ڽ�Ŭ���� ������
	public HourEmployee(String name, int id, int money, int hour) {
		super(name, id);
		this.money = money;
		this.hour = hour;
	}
	
	// computeSalary() �޼ҵ� ������
	@Override
	public int computeSalary() {
		return money * hour;
	}
	
	// toString() �޼ҵ� ������
	@Override
	public String toString() {
		return super.toString() + ", �ð��� �ӱ� : " + money + ", ���ѽð� : " + hour + ", �ݾ� : " + computeSalary();
	}
}

public class Answer_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Person[] person = new Person[100];
		boolean flag = true;
		int num = 0;
		
		while (flag) {
			System.out.print("1: Salaried ��ü ����, 2: Hour ��ü ���� 3. ���� --> ");
			int menu = in.nextInt();
			switch (menu) {
			case 1:
				System.out.println("�̸�, ���, �޿��� �Է��ϼ���");
				//���� �ۼ�
				person[num] = new SalariedEmployee(in.next(), in.nextInt(), in.nextInt());
				num++;
				break;
			case 2:
				//���� �ۼ�
				System.out.println("�̸�, ���, �ð����ӱ�, �ð��� �Է��ϼ���");
				person[num] = new HourEmployee(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
				num++;
				break;
			case 3:
				System.out.println("\n--------��ü ���ڵ� ���--------");
				for (int i = 0; i < num; i++) {
					System.out.println(person[i]);
				}
				System.out.println("���α׷��� �����մϴ�");
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}