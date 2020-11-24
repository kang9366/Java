package Lec;

class Box<T>{
	private T data;
	
	public Box(T data) {
		this.data = data;
	}
	
	public void set(T data) {this.data = data;}
	public T get() {return data;}
}

public class Generic {
	public static void main(String[] args) {
		Box<String> sg = new Box<> ("Generic");
		Box<Integer> ig = new Box<Integer>(340);
		System.out.println("<String>" + sg.get());
		System.out.println("<Integer" + ig.get());
	}
}