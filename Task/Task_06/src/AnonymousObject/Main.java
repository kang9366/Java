package AnonymousObject;

public class Main {
	public static void main(String[] args) {
		Ano ano = new Ano();
		ano.method1(new Person() {
			//�͸� �ڽ� ��ü ���� -> parameter ������ ����
			@Override
			void wake() {
				System.out.println("6�ÿ� �Ͼ�ϴ�.");
			}
		});
		ano.field.wake();
		//ano.field.study(); -> error
	}
}
