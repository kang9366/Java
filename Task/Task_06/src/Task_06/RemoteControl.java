package Task_06;

public interface RemoteControl {
	//��� �ʵ� ����
	public final static int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
	//abstract method ����
	void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	static void changeBattery() { 
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}