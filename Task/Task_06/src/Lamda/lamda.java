package Lamda;

@FunctionalInterface
interface Func1 {
	int calc(int a, int b);
}

@FunctionalInterface
interface Func2 {
	void sayHello();
}

public class lamda {
	public static void main(String[] args) {
		Func1 sub = (a, b) -> a - b;
		Func1 add2 = (a, b) -> a + b;
		Func2 hello = () -> System.out.println("Hello World!");
		int result = sub.calc(3, 4) + add2.calc(3, 5);
		System.out.println("result = " + result);
		hello.sayHello();
	}
}