package Task;

public class Lec01 {
	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = 0;
		}
		try {
			int result = array[12];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭�� �ε����� �߸��Ǿ����ϴ�.");
		}
		System.out.println("text sentence");
	}
}