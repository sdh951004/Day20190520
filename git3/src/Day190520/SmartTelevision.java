package Day190520;
// 다중 인터페이스 구현 클래스 선언
public class SmartTelevision implements RemoteControl, Searchable{
private int volume;
	@Override
	public void search(String url) {
		System.out.println("검색 주소 :"+url);
	}

	@Override
	public void turnOn() {
		System.out.println("Smart Tv 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Tv 전원을 끕니다.");
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
		System.out.println("현재 볼륨 :"+volume);
	}
	
}
