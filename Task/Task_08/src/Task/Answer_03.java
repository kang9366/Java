package Task;

import java.util.Scanner;

class NestStudent{
	private String name;
	Subject subject;
	
	public NestStudent(String name, int cnt) {
		this.name = name;
		System.out.println(name + "==>");
		subject = new Subject(cnt);
	}
	
	void stdPrint() {
		System.out.println("==============================");
		System.out.println(name + " �л��� ��������");
		subject.subjectprint();
	}
	
	class Subject{
		String[] title;
		public Subject(int num) {
			Scanner sc = new Scanner(System.in);
			title = new String[num];
			for (int i = 0; i < num; i++) {
				System.out.print("���� ����(" + (i+1) + ") : ");
				this.title[i] = sc.next();
			}
		}
		public void subjectprint() {
			for (int i = 0; i < title.length; i++) {
				System.out.println(title[i]);
			}
		}
	}
}
public class Answer_03 {
	public static void main(String[] args) {
		NestStudent obj[] = {new NestStudent("ȫ�浿", 2), new NestStudent("�Ӳ���", 3), new NestStudent("��û��", 1)};
		for(NestStudent ns : obj)
			ns.stdPrint();
	}
}