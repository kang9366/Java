package Lec;

class AutoSave extends Thread{
	public void save() {
		System.out.println("작업 내용 저장");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}

public class DaemonThread {
	public static void main(String[] args) {
		AutoSave as = new AutoSave();
		as.setDaemon(true);
		as.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("메인 스레드 종료");
		}
	}
}
