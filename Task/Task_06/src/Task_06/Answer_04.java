package Task_06;

abstract class Animal {
	private String type; // 유형
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
		System.out.println("기어다닙니다.");
	}

	@Override
	void sound() {
		System.out.println("옹알이를 합니다.");
	}
	
}

class Dog extends Animal{
	public Dog(String type) {
		super(type);
	}

	@Override
	void run() {
		System.out.println("네 발로 다닙니다.");
	}

	@Override
	void sound() {
		System.out.println("멍멍 소리를 냅니다.");
	}
}

public class Answer_04 {
	public static void play(Animal ani) {
	  //본인 작성
		if (ani instanceof Baby) {
			System.out.print("신생아 : ");
			ani.run();
			System.out.print("신생아 : ");
			ani.sound();
		}else if(ani instanceof Dog) {
			System.out.print("강아지 : ");
			ani.run();
			System.out.print("강아지 : ");
			ani.sound();
		}
	}
	public static void main(String[] args) {
		Animal animal = new Baby("신생아");
		play(animal);
		animal = new Dog("강아지");
		play(animal);
	}
}

