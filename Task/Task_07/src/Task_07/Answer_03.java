package Task_07;

interface Operation{
	void cut();
	void wash();
}

class Hair implements Operation{
	private String type;
	
	public Hair(String type) {
		this.type = type;
	}
	@Override
	public void cut() {
		System.out.println(type + "�� �ڸ���");
	}
	@Override
	public void wash() {
		System.out.println(type + "�� ����");
	}
	void tint(String color) {
		System.out.println(type + "�� " + color + "�� �����ϴ�");
	}
}

class Fruit implements Operation{
	private String type;
	
	public Fruit(String type) {
		this.type = type;
	}
	@Override
	public void cut() {
		System.out.println(type + "�� �ڸ���");
	}
	@Override
	public void wash() {
		System.out.println(type + "�� �Ĵ�");
	}
	void pack(int cnt) {
		System.out.println(type + "�� " + cnt + "�� �����ϴ�");
	}
}

public class Answer_03 {
	static void run(Operation oper) {
		if (oper instanceof Hair) {
			oper.cut();
			oper.wash();
			((Hair) oper).tint("brown");
		}else if(oper instanceof Fruit) {
			oper.cut();
			oper.wash();
			((Fruit) oper).pack(10);
		}
	}
	
	public static void main(String[] args) {
		Operation oper = null;
		oper = new Hair("�� �Ӹ�");
		run(oper);
		oper = new Fruit("���");
		run(oper);
	}


}
