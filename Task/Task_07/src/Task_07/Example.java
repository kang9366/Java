package Task_07;

@FunctionalInterface
interface Vehicle{
	void run(int num);
}

abstract class Person{
	String dept;
	Person(String dept){
		this.dept = dept;
	}
	void work() {
		System.out.println("��� �մϴ�.");
	}
}

public class Example {
	public static void main(String[] args) {
		//�͸� ��ü ����
		Vehicle taxi = new Vehicle() {
			public void run(int num) {
				System.out.println(num + "���� �ýð� �޸��ϴ�.");
				power();
			}
			public void power() {
				System.out.println("�ýô� LPG�� ����մϴ�.");
			}
		};
		//�Լ��� �������̽��� ������ ���ٽ�
		Vehicle bus = num -> {
			System.out.println(num + "���� ������ �޸��ϴ�.");
		};
		Person java = new Person("Samsung") {
			void time(int t) {
				System.out.println("��� �ð��� " + t + "�� �Դϴ�.");
			}
			void work() {
				System.out.println(dept + "���� �ٹ��մϴ�.");
				time(13);
			}
		};
		java.work();
		bus.run(3);
		taxi.run(5);
		//taxi.power(); -> �͸� ��ü ����� �ܺο��� ������ �� ����.
		//java.time(); -> �͸� ��ü ����� �ܺο��� ������ �� ����.
	}
}
