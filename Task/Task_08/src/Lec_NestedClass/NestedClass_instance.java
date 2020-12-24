package Lec_NestedClass;

class Outs{
	private int outField;
	Outs(){
		System.out.println("create Out class instance");
	}
	class In{
		int inField;
		// can't use static field and static method
		In(){
			System.out.println("create In class instance ");
			outField = 50;
		}
		void inMethod(){
			System.out.println("run inMethod");
			System.out.println("Outside class - outfield : " + outField);
			System.out.println("Inside class - infield : " + inField);
		}
	}
}

public class NestedClass_instance {
	public static void main(String[] args) {
		Outs out = new Outs();
		Outs.In in = out.new In();
		in.inField = 30;
		in.inMethod();
	}
}
