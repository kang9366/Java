package Task_07;

interface Action{
	void move();
}

public class Answer_01 {
	public static void main(String[] args) {
		//劳疙 按眉 积己
		Action person = new Action() {
			public void move() {
				System.out.println("崔府扁");
			}
		};
		Action baby = ()-> {System.out.println("叭扁");};
		person.move();
		baby.move();
	}
}