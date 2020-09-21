package Task_02;

public class Answer_02 {
	static int max(int ...value) {
		int max_num = 0;
		for (int i = 0; i < value.length; i++) {
			if(value[i] >= max_num) {
				max_num = value[i];
			}
		}
		return max_num;
	}
	
	static double max(double ... value) {
		double max_num = 0;
		for (int i = 0; i < value.length; i++) {
			if(value[i] >= max_num) {
				max_num = value[i];
			}
		}
		return max_num;
	}
	
    public static void main(String[] args) {
	System.out.println("정수 최대 값1 : " + max(4, 6, 5, 9, 23, 6));
	System.out.println("정수 최대 값2 : " + max(48, 24, 15, 36, 54, 89, 69, 82));
	System.out.println("실수 최대 값1 : " + max(4.5, 8.6, 12.3, 7.3, 2.4));
	System.out.println("실수 최대 값2 : " + max(12.6, 8.5, 46.5, 12.4, 6.41, 4.2, 9.5, 3.4));
    }
}
