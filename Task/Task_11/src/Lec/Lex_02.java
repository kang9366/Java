package Lec;

class PrintThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("Ω««‡¡ﬂ");
			if(Thread.interrupted()) {
				break;
			}
		}
	}
}
public class Lex_02 {
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			pt.interrupt();
		}
	}
}
