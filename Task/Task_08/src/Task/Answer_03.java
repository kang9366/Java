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
		System.out.println(name + " 학생의 수강과목");
		subject.subjectprint();
	}
	
	class Subject{
		String[] title;
		public Subject(int num) {
			Scanner sc = new Scanner(System.in);
			title = new String[num];
			for (int i = 0; i < num; i++) {
				System.out.print("수강 과목(" + (i+1) + ") : ");
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
		NestStudent obj[] = {new NestStudent("홍길동", 2), new NestStudent("임꺽정", 3), new NestStudent("심청이", 1)};
		for(NestStudent ns : obj)
			ns.stdPrint();
	}
}