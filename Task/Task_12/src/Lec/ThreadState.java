package Lec;

class PrintThread extends Thread {
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if (Thread.interrupted())
				break;
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

public class ThreadState {
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		pt.interrupt();
	}
}
