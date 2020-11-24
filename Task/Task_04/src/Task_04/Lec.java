package Task_04;

class Address{
	private String name;
	private String phone;
	
	public Address(String na, String ph) {
		System.out.println("----- 부모클래스 생성자 -----");
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화  : " + phone);
	}
}

class UnivAdd extends Address{
	private String major; //전공
	
	public UnivAdd(String na, String ma, String ph) {
		super(na, ph);
		System.out.println("----- 자식클래스(UnivAdd) 생성자 -----");
		major = ma;
	}
//super : 부모클래스 생성자 호출, super()
//클래스 메소드 호출 : super.method()
//클래스 필드 접근: super.field()
	
	@Override
	public void showInfo() { //메소드 재정의
		super.showInfo(); //부모 클래스의 showInfo() 메소드 호출
		System.out.println("전공 : " + major);
	}
	
}

class CompAdd extends Address{
	private String department;
	public CompAdd(String na, String de, String ph) {
		super(na, ph);
		System.out.println("----- 자식클래스(CompAdd) 생성자 -----");
		department = de;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : " + department);
	}
}

public class Lec {
	public static void write(Address[] ad, int cnt) {
		for (int i = 0; i < cnt; i++) {
			ad[i].showInfo();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Address [] frns = new Address[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivAdd("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivAdd("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new CompAdd("YOON", "R&D 1", "02-123-999");
		frns[cnt++] = new CompAdd("PARK", "R&D 2", "02-321-777");
		
		/*
		 * for (int i = 0; i < cnt; i++) {//다형성 frns[i].showInfo(); //오버라이딩 한 메소드가 출력된다.
		 * System.out.println(); }
		 */
		
		write(frns, cnt);
	}
}
