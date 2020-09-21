package Task_04;

class Address{
	private String name;
	private String phone;
	
	public Address(String na, String ph) {
		System.out.println("-----부모 클래스 생성자-----");
		this.name = na;
		this.phone = ph;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화  : " + phone);
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
