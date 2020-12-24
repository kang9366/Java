package Task;

class CharThread extends Thread{
	int num;
	char[] cs;
	public CharThread(char[] cs, int num) {
		this.num = num;
		this.cs = cs;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < num; i++) {
				if(i%2 == 0) {
					System.out.print(cs[0]);
					Thread.sleep(500);
				}else {
					System.out.print(cs[1]);
					Thread.sleep(500);
				}
			}
		}catch(InterruptedException e) {}
	}
}

class NumThread extends Thread{
	int num;
	public NumThread(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		try {
			for (int i = 0; i < num; i++) {
				System.out.print(i+1);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {}
	}
}

public class Task_03 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 21 + 1);
		Thread cht = new CharThread(new char[] {'ㅁ', 'ㅇ'}, num);
		Thread nut = new NumThread(num);
		cht.start();
		nut.start();
	}
}
