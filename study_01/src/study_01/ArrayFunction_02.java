package study_01;

public class ArrayFunction_02 {
	static boolean search(int[] dim, int value) {
		boolean f = false;
		for(int data : dim)
			if(data == value) {
				f = true;
				break;
			}
		return f;
	}
	public static void main(String[] args) {
		int arr[] = {12, 58, 24, 36, 45, 98, 77, 25};
		String result = search(arr, 24) ? "존재 " : "해당없음";
		System.out.println("result = " + result);
		System.out.println("result = " + search(arr, 55));
	}
}
