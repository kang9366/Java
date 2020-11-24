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
		System.out.println("출근 합니다.");
	}
}

public class Example {
	public static void main(String[] args) {
		//익명 객체 구현
		Vehicle taxi = new Vehicle() {
			public void run(int num) {
				System.out.println(num + "대의 택시가 달립니다.");
				power();
			}
			public void power() {
				System.out.println("택시는 LPG를 사용합니다.");
			}
		};
		//함수형 인터페이스를 구현한 람다식
		Vehicle bus = num -> {
			System.out.println(num + "대의 버스가 달립니다.");
		};
		Person java = new Person("Samsung") {
			void time(int t) {
				System.out.println("출근 시간은 " + t + "시 입니다.");
			}
			void work() {
				System.out.println(dept + "에서 근무합니다.");
				time(13);
			}
		};
		java.work();
		bus.run(3);
		taxi.run(5);
		//taxi.power(); -> 익명 객체 멤버는 외부에서 참조할 수 없다.
		//java.time(); -> 익명 객체 멤버는 외부에서 참조할 수 없다.
	}
}
