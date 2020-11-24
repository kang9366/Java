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
		String[] word_arr = {"강아지", "지금", "금수저", "저장"};
		String word = word_arr[(int)(Math.random()*word_arr.length)];
		
		while(true) {
			System.out.println("끝말잇기 게임을 시작합니다~~~");
			while(true) {
				System.out.print(word + "의 " + lastWord(word) + "로 시작하는 단어 >> ");
				String word_input = sc.next();
				if(lastWord(word) == firstWord(word_input)) {
					word = word_input;
				}else {
					System.out.println("틀렸습니다.");
					System.out.print("계속 하시겠습니까? >> ");
					if(sc.next().equals("c")) {
						break;
					}else {
						System.out.println("프로그램 종료");
						System.exit(0);
					}
				}
				
			}
		}
	}
}