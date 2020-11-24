package Lec;

class SimplePair<T>{
	private T data1, data2;
	public SimplePair(T data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public T getFirst() {
		return data1;
	}
	
	public T getSecond() {
		return data2;
	}
	
	public void setFirst(T data1) {
		this.data1 = data1;
	}
	
	public void setSecond(T data2) {
		this.data2 = data2;
	}
}

public class Lec_02 {
	public static void main(String[] args) {
		SimplePair<String> pair1 = new SimplePair<String>("apple", "tomato");
		SimplePair<Integer> pair2 = new SimplePair<>(30, 40);
		
		System.out.println("pair1 : " + pair1.getFirst());
		System.out.println("pair1 : " + pair1.getSecond());
		System.out.println("pair2 : " + pair2.getFirst());
		System.out.println("pair2 : " + pair2.getSecond());
	}
}
