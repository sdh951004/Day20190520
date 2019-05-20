package Day190520;

public class Audio implements RemoteControl{

	/*
	 * RemoteControl 인터페이스의 구현클래스로 선언
	 */
	//필드 선언
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume=volume;
		}
		System.out.println("현재 오디오볼륨:"+volume);
	}
}
