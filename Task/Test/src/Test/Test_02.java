package Test;

import java.util.Scanner;

public class Test_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] endList = { "지금", "금수저", "저장", "강산", "산책", "책임" }; // 이건 취향에 맞게
		String word = "", input = "", choice = "";
		while (true) {
			System.out.println("끝말 잇기 게임을 시작합니다~~~");
			word = endList[(int) (Math.random() * endList.length)];
			while (true) {
				System.out.printf("%s의 %s로 시작하는 단어 >> ", word, word.charAt(word.length() - 1));
				input = sc.next();
				if (word.charAt(word.length() - 1) == input.charAt(0)) {
					word = input;
				} else {
					System.out.println("틀렸습니다.");
					break;
				}
			}
			System.out.print("계속하겠습니까? >> ");
			choice = sc.next();
			if (!choice.toLowerCase().equals("c")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}