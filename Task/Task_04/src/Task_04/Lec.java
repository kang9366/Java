package Task_04;

class Address{
	private String name;
	private String phone;
	
	public Address(String na, String ph) {
		System.out.println("----- �θ�Ŭ���� ������ -----");
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ  : " + phone);
	}
}

class UnivAdd extends Address{
	private String major; //����
	
	public UnivAdd(String na, String ma, String ph) {
		super(na, ph);
		System.out.println("----- �ڽ�Ŭ����(UnivAdd) ������ -----");
		major = ma;
	}
//super : �θ�Ŭ���� ������ ȣ��, super()
//Ŭ���� �޼ҵ� ȣ�� : super.method()
//Ŭ���� �ʵ� ����: super.field()
	
	@Override
	public void showInfo() { //�޼ҵ� ������
		super.showInfo(); //�θ� Ŭ������ showInfo() �޼ҵ� ȣ��
		System.out.println("���� : " + major);
	}
	
}

class CompAdd extends Address{
	private String department;
	public CompAdd(String na, String de, String ph) {
		super(na, ph);
		System.out.println("----- �ڽ�Ŭ����(CompAdd) ������ -----");
		department = de;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�μ� : " + department);
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
		 * for (int i = 0; i < cnt; i++) {//������ frns[i].showInfo(); //�������̵� �� �޼ҵ尡 ��µȴ�.
		 * System.out.println(); }
		 */
		
		write(frns, cnt);
	}
}
