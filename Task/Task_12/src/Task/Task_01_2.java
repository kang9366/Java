package Task;

public class Task_01_2 {
	public static void main(String[] args){
		try {
			sub();
		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
	}
	public static void sub() throws ArrayIndexOutOfBoundsException{
		int[] array = new int[] {34,56,12,87,34,78};
		System.out.println("array[array.length] : " + array[array.length]);
	}
}