package Task_06;

public interface RemoteControl {
	//상수 필드 선언
	public final static int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
	//abstract method 선언
	void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() { 
		System.out.println("건전지를 교환합니다.");
	}
}