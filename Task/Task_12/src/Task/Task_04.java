package Task;

class Shared{
	int sum, i;
	
	Shared(){
		sum=0;
		i=1;
	}
	
	public void sharedM(String srName) {
		synchronized (srName) {
			for(int j = 0; j < 5; j++) {
				sum += i;
				i++;
				System.out.println(srName  + ":" + sum);
			}
		}
	}
}

class MyThread extends Thread{
	String srName;
	Shared sr;
	
	public MyThread(String srName, Shared sr) {
		this.srName = srName;
		this.sr = sr;
	}
	
	@Override
	public void run() {
		sr.sharedM(srName);
	}
}

public class Task_04 {
	public static void main(String[] args) {
		Shared res = new Shared();
		MyThread my_thread1 = new MyThread("thd1", res);
		MyThread my_thread2 = new MyThread("thd2", res);
		MyThread my_thread3 = new MyThread("thd3", res);
		my_thread1.start();
		my_thread2.start();
		my_thread3.start();
	}
}