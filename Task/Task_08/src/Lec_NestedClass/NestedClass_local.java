package Lec_NestedClass;

class Out{
	Out(){
		System.out.println("create Out class instance");
	}
	void method() {
		class Local{ // local class
			int field; // instance field
			//can't use static field and static method
			Local(){
				System.out.println("create In class instance");
			}
			void localMethod() {
				System.out.println("Local class method\nLocal class instance field => " + field);
			}
		}
	}
}

public class NestedClass_local {
	public static void main(String[] args) {
		
	}
}
