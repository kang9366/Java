package AnonymousObject;

class Ano {
	Person field = new Person() {
		//익명 객체 생성 -> 필드 초기값으로 대입
		void study() {
			System.out.println("열심히 자바를 공부합니다.");
		}
		void wake() {
			System.out.println("8시에 일어납니다.");
		};
	};
	void method1(Person per) {
		per.wake();
	}
