package Lec;

class PrintThread extends Thread {
	public void run() {
		while (true) {
			System.out.println("실행 중");
			if (Thread.interrupted())
				break;
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
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
