package Task_04;

class Address{
	private String name;
	private String phone;
	
	public Address(String na, String ph) {
		System.out.println("-----�θ� Ŭ���� ������-----");
		this.name = na;
		this.phone = ph;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ  : " + phone);
	}
}

class UnivAdd extends Address{
	public UnivAdd(String na, String ph) {
		super(na, ph);
		// TODO Auto-generated constructor stub
	}

	private String major;
	
}

public class Answer_01 {

}
