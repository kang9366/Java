package Task_06;

class TV implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("---- TV������ " + volume + "���� �մϴ� ----");
		System.out.println("���� TV ���� : " + volume);
	}
	
	public void mute() {
		System.out.println("---- TV ������ �������� �մϴ� ----");
		setMute(true);
	}
}

class SmartPhone implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("SmartPhone�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartPhone�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("---- SmartPhone ������ " + volume + "���� �մϴ� ----");
		System.out.println("���� SmartPhone ���� : " + volume);
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
