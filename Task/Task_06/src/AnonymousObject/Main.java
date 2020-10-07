package AnonymousObject;

public class Main {
	public static void main(String[] args) {
		Ano ano = new Ano();
		ano.method1(new Person() {
			//익명 자식 객체 생성 -> parameter 값으로 대입
			@Override
			void wake() {
				System.out.println("6시에 일어납니다.");
			}
		});
		ano.field.wake();
		//ano.field.study(); -> error
	}
}
