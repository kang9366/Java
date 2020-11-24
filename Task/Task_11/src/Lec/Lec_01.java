package Lec;

class ThreadA extends Thread{
	@Override
	public void run() {
		try {
			for(char ch = 'A'; ch <= 'M'; ch++) {
				System.out.println(ch);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {}
	}
}

class ThreadB implements Runnable{
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {}
	}
}

public class Lec_01 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 : " + mainThread.getName());
		ThreadA th1 = new ThreadA();
		Thread th2 = new Thread(new ThreadB());
		
		System.out.println("작업 스레드 이름 : " + th1.getName());
		System.out.println("작업 스레드 이름 : " + th2.getName());
		th1.start();
		th2.start();
	}

}
