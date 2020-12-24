package Test;

class BankCount{
	int balance = 5000;
	synchronized void deposit(int amount) {
		balance += amount;
	}
	
	synchronized void withdraw(int amount) {
		balance -= amount;
	}
	
	int getBalance() {
		return balance;
	}
}

class Parent extends Thread{
	BankCount b;
	public Parent(BankCount b) {
		this.b = b;
	}
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep((int) (Math.random()*10)+1);
			} catch (Exception e) {}
			b.deposit(1000);
			System.out.println("+balance is : "+ b.getBalance());
		}
	}
}

class Child extends Thread{
	BankCount b;
	Child(BankCount b){
		this.b = b;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep((int) (Math.random()*10) + 1);
			} catch (Exception e) {}
			b.withdraw(1000);
			System.out.println("-balance is : " + b.getBalance());
		}
	}
}

public class Test_06{
	public static void main(String[] args) {
		BankCount b = new BankCount();
		Parent thread1 = new Parent(b);
		Child thread2 = new Child(b);
		thread1.start();
		thread2.start();
	}
}