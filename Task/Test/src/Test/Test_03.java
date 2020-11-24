package Test;

class GenericTest<T>{
	private T name;
	private T age;
	
	public GenericTest(T name, T age){
		this.name = name;
		this.age=  age;
	}
	
	public String toString() {
		return "age : " + age + "name : " + name;
	}
}

public class Test_03{
	public static void main(String args[]) {
		GenericTest<String> g1 = new GenericTest("kang", 20);
		g1.toString();
	}
}