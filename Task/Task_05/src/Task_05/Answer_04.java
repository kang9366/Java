package Task_05;

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
	
	@Override
	public String toString() {
		return super.getType() + " : ";
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
	
	@Override
	public String toString() {
		return super.getType() + " : ";
	}
}

public class Answer_04 {
	public static void play(Animal ani) {
	  //���� �ۼ�
		if (ani instanceof Baby) {
			System.out.print(ani);
			ani.run();
			System.out.print(ani);
			ani.sound();
		}else if(ani instanceof Dog) {
			System.out.print(ani);
			ani.run();
			System.out.print(ani);
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
