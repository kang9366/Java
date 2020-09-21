package Task_02;

public class Answer_04 {
	static int max_index(int[] arr) {
		int index = 0;
		int max_page = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max_page) {
				max_page = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		String[] title = {"�ڹ�", "���̽�", "�ڵ�", "�ڹٽ�ũ��Ʈ", "�ڷᱸ��"};
		int[] pages = {150, 100, 120, 200, 180};
		int max_page = max_index(pages);
		System.out.println("�ִ� ������ �� : " + pages[max_page]);
		System.out.println("�ִ� ���������� ���� å : " + title[max_page]);
	}
}
