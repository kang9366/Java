package Task_07;

interface Action{
	void move();
}

public class Answer_01 {
	public static void main(String[] args) {
		//�͸� ��ü ����
		Action person = new Action() {
			public void move() {
				System.out.println("�޸���");
			}
		};
		Action baby = ()-> {System.out.println("�ȱ�");};
		person.move();
		baby.move();
	}
}