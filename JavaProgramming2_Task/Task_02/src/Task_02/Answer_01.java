package Task_02;

public class Answer_01 {
	static int[] init(int[] data) {
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100);
		}
		return data;
	}
	
	static void reverse(int[] data) {
		for (int i = data.length-1; i >= 0; i--) {
			System.out.print(data[i] + "\t");
		}
	}
	public static void main(String[] args){
	   int[] data=new int[10]; //int �迭 ���� & ����
	   init(data); //������ �迭 �ʱ�ȭ
		
	   System.out.println("------- �ʱ�ȭ �� �迭 ��� -----------");
	   for(int temp:data)
		System.out.print(temp + "\t");
	   System.out.println();
			
	   System.out.println("------- �������� ��� -----------");
	   reverse(data);
	}
}
