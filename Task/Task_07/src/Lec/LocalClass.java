package Lec;


//���� Ŭ����
//�޼ҵ� ������ ����Ǵ� Ŭ���� -> ���������� ��� �Ұ�
//����Ŭ������ �޼ҵ尡 ����� �� �޼ҵ� ������ ��ü�� �����ϰ� ���
//�񵿱� ó���� ���� ������ ��ü ������ ����Ѵ�.
class Out{
	Out(){
		System.out.println("Out ��ü ����");
	}
	
	void method() {
		class Local{
			int field;
			Local(){
				System.out.println("Local Ŭ���� ��ü ����");
			}
			void localMethod() {
				System.out.println("Local Ŭ���� �޼ҵ�\n���� Ŭ���� �ν��Ͻ� �ʵ� => " + field);
			}
		}
		Local local = new Local();
		local.field = 50;
		local.localMethod();
	}
}

public class LocalClass {
	public static void main(String[] args) {
		Out out = new Out();
		out.method();
	}
}