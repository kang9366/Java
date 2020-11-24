package Task;

class Thread1 implements Runnable{
	public void run() {
		String[] arr = {"¡ß", "¢Ã", "¡Ø", "¡Û", "¢¼"};
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("lamda1 : " + arr[i]);
				Thread.sleep(500);
			}
		} catch (Exception e) {}
	}
}

class Thread2 implements Runnable{
	public void run() {
		try {
			for (char ch = 'd'; ch <= 't'; ch+=2) {
				System.out.println("lamda2 : " + ch);
				Thread.sleep(500);
			}
		} catch (Exception e) {}
	}
}

public class Task_01 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread1());
		Thread th2 = new Thread(new Thread2());
		th1.start();
		th2.start();
	}
}