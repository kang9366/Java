package Task;

class Calculator{
	Control control;
	
	void setControl(Control control) {
		this.control = control;
	}
	
	void compute(int a, int b) {
		control.run(a, b);
	}
	
	static interface Control{
		void run(int a, int b);
	}
}
class Add implements Calculator.Control{
	public void run(int a, int b) {
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
	}
}

class Ewp implements Calculator.Control{
	public void run(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		System.out.println(a + " ** " + b + " = " + result);
	}
}

public class Answer_02 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setControl(new Add());
		cal.compute((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
		cal.setControl(new Ewp());
		cal.compute(5, 3);
	}
}