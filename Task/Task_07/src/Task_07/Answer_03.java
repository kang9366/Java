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
		System.out.println(type + "를 자르다");
	}
	@Override
	public void wash() {
		System.out.println(type + "를 감다");
	}
	void tint(String color) {
		System.out.println(type + "를 " + color + "로 염색하다");
	}
}

class Fruit implements Operation{
	private String type;
	
	public Fruit(String type) {
		this.type = type;
	}
	@Override
	public void cut() {
		System.out.println(type + "를 자르다");
	}
	@Override
	public void wash() {
		System.out.println(type + "를 씻다");
	}
	void pack(int cnt) {
		System.out.println(type + "를 " + cnt + "개 포장하다");
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
		oper = new Hair("긴 머리");
		run(oper);
		oper = new Fruit("사과");
		run(oper);
	}


}
