package Test;

class Thread1 implements Runnable{
	public void run() {
		System.out.println("thread1 run");
	}
}

class Thread2 extends Thread{
	public void run() {
		setName("thread2");
		System.out.println(getName() + " run");
	}
}

public class ComplexTest{
	public static void main(String[] args) {
		//implements runnable
		Thread t1 = new Thread(new Thread1());
		t1.start();
		
		//extends thread
		Thread2 t2 = new Thread2();
		t2.start();
		
		//anonymous sub object
		Thread t3 = new Thread() {
			public void run() {
				System.out.println("thread3 run");
			}
		};
		t3.start();
		
		//lamda
		Thread t4 = new Thread( () -> {
			System.out.println("thread4 run");
		});
		t4.start();
	}
}