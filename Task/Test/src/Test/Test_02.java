package Test;

import java.util.Scanner;

public class Test_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] endList = { "����", "�ݼ���", "����", "����", "��å", "å��" }; // �̰� ���⿡ �°�
		String word = "", input = "", choice = "";
		while (true) {
			System.out.println("���� �ձ� ������ �����մϴ�~~~");
			word = endList[(int) (Math.random() * endList.length)];
			while (true) {
				System.out.printf("%s�� %s�� �����ϴ� �ܾ� >> ", word, word.charAt(word.length() - 1));
				input = sc.next();
				if (word.charAt(word.length() - 1) == input.charAt(0)) {
					word = input;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					break;
				}
			}
			System.out.print("����ϰڽ��ϱ�? >> ");
			choice = sc.next();
			if (!choice.toLowerCase().equals("c")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
		sc.close();
	}
}