package Task;

class MyArray<T>{
	private T arr[];
	
	public MyArray(T arr[]) {
		this.arr = arr;
	}
	
	public T firstE() {
		return arr[0];
	}
	public T lastE() {
		return arr[arr.length-1];
	}
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
}

public class Task_03 {
	public static void main(String[] args) {
		MyArray<Integer> arr1 = new MyArray<>(new Integer[] {5,3,9,5,2,78,45,91});
		MyArray<Double> arr2 = new MyArray<>(new Double[] {2.3, 1.2, 67.3, 45.2, 4.2, 66.4});
		MyArray<Character> arr3 = new MyArray<>(new Character[] {'d', 'r', 'q', 'y', 'p', 'b', 's'});
		
		System.out.println("- Integer �迭 ���� ��� -");
		arr1.display();
		System.out.println("\n- Double �迭 ���� ��� -");
		arr2.display();
		System.out.println("\n- Character �迭 ���� ��� -");
		arr3.display();
		
		System.out.print("\n-------- Integer �迭 ù��°�� ������ ���� : ");
		System.out.println(arr1.firstE() + " / " + arr1.lastE());
		System.out.print("-------- Double �迭 ù��°�� ������ ���� : ");
		System.out.println(arr2.firstE() + " / " + arr2.lastE());
		System.out.print("-------- Character �迭 ù��°�� ������ ���� : ");
		System.out.println(arr3.firstE() + " / " + arr3.lastE());
	}
}
