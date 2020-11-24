package Task;

public class Task_02 {
	public static void main(String[] args) {
		String[] arr = {"ㅁㅁ", "��", "��", "��", "��"};
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("lamda1 : " + arr[i]);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (char ch = 'd'; ch <= 't'; ch+=2) {
				System.out.println("lamda2 : " + ch);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		});
		thread1.start();
		thread2.start();
	}
}