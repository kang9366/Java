package Lec;


//로컬 클래스
//메소드 내에서 선언되는 클래스 -> 접근제한자 사용 불가
//로컬클래스는 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용
//비동기 처리를 위한 스레드 객체 생성시 사용한다.
class Out{
	Out(){
		System.out.println("Out 객체 생성");
	}
	
	void method() {
		class Local{
			int field;
			Local(){
				System.out.println("Local 클래스 객체 생성");
			}
			void localMethod() {
				System.out.println("Local 클래스 메소드\n로컬 클래스 인스턴스 필드 => " + field);
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