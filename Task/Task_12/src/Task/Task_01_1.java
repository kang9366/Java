package Task;

public class Task_01_1 {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		int[] array = new int[] {34,56,12,87,34,78};
		try {
			System.out.println("array[array.length] : " + array[array.length]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
		}
	}
}