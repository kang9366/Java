package Task;

import java.util.Scanner;

public class Task_03 {
	public static char firstWord(String word) {
		return word.charAt(0);
	}
	
	public static char lastWord(String word) {
		return word.charAt(word.length()-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word_arr = {"������", "����", "�ݼ���", "����"};
		String word = word_arr[(int)(Math.random()*word_arr.length)];
		
		while(true) {
			System.out.println("�����ձ� ������ �����մϴ�~~~");
			while(true) {
				System.out.print(word + "�� " + lastWord(word) + "�� �����ϴ� �ܾ� >> ");
				String word_input = sc.next();
				if(lastWord(word) == firstWord(word_input)) {
					word = word_input;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					System.out.print("��� �Ͻðڽ��ϱ�? >> ");
					if(sc.next().equals("c")) {
						break;
					}else {
						System.out.println("���α׷� ����");
						System.exit(0);
					}
				}
				
			}
		}
	}
}