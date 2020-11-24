package Task_07;

import java.util.Scanner;

abstract class Media{
	abstract void play(String instru);
	abstract void stop(String instru);
}

public class Answer_02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Media media = new Media() {
			void play(String instru) {
				System.out.println(instru + "�� ����մϴ�.");
			};
			void stop(String instru) {
				System.out.println(instru + "�� �����մϴ�.");
			};
		};
		
		System.out.println("��⸦ �����ϼ���");
		System.out.print("1:MP3 2:CD Player 3:WindowMediaPlay >> ");
		switch(sc.nextInt()) {
		case 1:
			media.play("MP3");
			media.stop("MP3");
			break;
		case 2:
			media.play("CD Player");
			media.stop("CD Player");
			break;
		case 3:
			media.play("WindowMediaPlay");
			media.stop("WindowMediaPlay");
			break;
		default:
			break;
		}
	}
}
