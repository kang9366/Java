package Lec;

class Button{
	Onclick onclick;
	void setOnclick(Onclick onclick) {
		this.onclick = onclick;
	}
	void touch() {
		onclick.Onclick();
	}
	static interface Onclick{
		void Onclick();
	}
}

class Call implements Button.Onclick{
	@Override
	public void Onclick() {
		System.out.println("전화 걸기");
	}
}

class Message implements Button.Onclick{
	@Override
	public void Onclick() {
		System.out.println("메세지 보내기");
	}
}

public class NestedClass {
	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnclick(new Message());
		btn.touch();
		btn.setOnclick(new Call());
		btn.touch();
	}
}
