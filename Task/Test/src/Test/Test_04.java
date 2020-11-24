package Test;

class SharedResource {
	long nF1 = 1, nF2 = 1, nResult = 0;

	public synchronized void changeShared(String srName) { // 임계영역
		nResult = nF1 + nF2;
		for (long l = 0; l < 10000000; l++) {
		}
		nF2 = nF1;
		for (long l = 0; l < 10000000; l++) {
		}
		nF1 = nResult;
		System.out.println(srName + ":" + nResult);
	}
}

class MyThread extends Thread {
	SharedResource sr;
	String srName;

	public MyThread(String srName, SharedResource sr) {
		this.srName = srName;
		this.sr = sr;
	}
	public void run() {
		for (int i = 0; i < 5; i++)
			sr.changeShared(srName);
	}
}

public class Test_04 {
	public static void main(String[] args) {
		SharedResource res = new SharedResource();
		MyThread my_thread1 = new MyThread("thd1", res);
		MyThread my_thread2 = new MyThread("thd2", res);
		MyThread my_thread3 = new MyThread("thd3", res);
		my_thread1.start();
		my_thread2.start();
		my_thread3.start();
	}
}
