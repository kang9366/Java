package AnonymousObject;

class Ano {
	Person field = new Person() {
		//�͸� ��ü ���� -> �ʵ� �ʱⰪ���� ����
		void study() {
			System.out.println("������ �ڹٸ� �����մϴ�.");
		}
		void wake() {
			System.out.println("8�ÿ� �Ͼ�ϴ�.");
		};
	};
	void method1(Person per) {
		per.wake();
	}
