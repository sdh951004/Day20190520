package Day190520;

public class RemoteControlerMain {

	public static void main(String[] args) {
		//인터페이스 타입의 변수 rc를 선언
		RemoteControl rc;
		
		//rc에 Tv 객체를 대입해서 Tv의 각 메소드 호출
		rc= new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		//rc에 Audio객체를 대입해서 Audio의 각  메소드 호출
		rc= new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(6);
		
		
		rc= new SmartTelevision();
		rc.turnOn();
		rc.setMute(true);
		
		rc.turnOff();
		rc.setVolume(3);
		
		SmartTelevision st= new SmartTelevision();
		st.turnOn();
		st.turnOff();
		st.search("www.naver.com");
		st.setVolume(4);
		//changeBattery 메소드 호출.
		RemoteControl.changeBattery();//static으로 선언되서 인터페이스 자체에서 메소드 호출.
	}

}
