package Test;

import java.util.Scanner;

class T1 extends Thread{
	boolean flag;
	
	public void stop(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		while(true) {
			System.out.println(1);
			if(flag) {
				break;
			}
		}
	}
}

public class Test_02{
	public static void main(String[] args) throws Exception {
		T1 thread1 = new T1();
		System.out.println(Thread.currentThread().getName());
		try {
			thread1.start();
			thread1.sleep(500);
		} catch (Exception e) {}
			thread1.stop(true);
			System.out.println("스레드 종료");
	}
}