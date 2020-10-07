package Task_06;

abstract class Animal {
	private String type; // ����
	public Animal(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	abstract void run(); 
	abstract void sound();
}

class Baby extends Animal{
	public Baby(String type) {
		super(type);
	}

	@Override
	void run() {
		System.out.println("���ٴմϴ�.");
	}

	@Override
	void sound() {
		System.out.println("�˾��̸� �մϴ�.");
	}
	
}

class Dog extends Animal{
	public Dog(String type) {
		super(type);
	}

	@Override
	void run() {
		System.out.println("�� �߷� �ٴմϴ�.");
	}

	@Override
	void sound() {
		System.out.println("�۸� �Ҹ��� ���ϴ�.");
	}
}

public class Answer_04 {
	public static void play(Animal ani) {
	  //���� �ۼ�
		if (ani instanceof Baby) {
			System.out.print("�Ż��� : ");
			ani.run();
			System.out.print("�Ż��� : ");
			ani.sound();
		}else if(ani instanceof Dog) {
			System.out.print("������ : ");
			ani.run();
			System.out.print("������ : ");
			ani.sound();
		}
	}
	public static void main(String[] args) {
		Animal animal = new Baby("�Ż���");
		play(animal);
		animal = new Dog("������");
		play(animal);
	}
}

