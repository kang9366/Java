package Task_06;

class TV implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("---- TV볼륨을 " + volume + "으로 합니다 ----");
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	public void mute() {
		System.out.println("---- TV 볼륨을 무음으로 합니다 ----");
		setMute(true);
	}
}

class SmartPhone implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("SmartPhone을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartPhone을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("---- SmartPhone 볼륨을 " + volume + "으로 합니다 ----");
		System.out.println("현재 SmartPhone 볼륨 : " + volume);
	}
}

public class Answer_02 {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new TV();
		rc.turnOn();
		rc.setVolume(10);
		((TV) rc).mute();
		
		rc = new SmartPhone();
		rc.turnOn();
		rc.setVolume(50);
		RemoteControl.changeBattery();
	}
}
