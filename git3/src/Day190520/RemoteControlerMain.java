package Day190520;

public class RemoteControlerMain {

	public static void main(String[] args) {
		//�������̽� Ÿ���� ���� rc�� ����
		RemoteControl rc;
		
		//rc�� Tv ��ü�� �����ؼ� Tv�� �� �޼ҵ� ȣ��
		rc= new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		//rc�� Audio��ü�� �����ؼ� Audio�� ��  �޼ҵ� ȣ��
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
		//changeBattery �޼ҵ� ȣ��.
		RemoteControl.changeBattery();//static���� ����Ǽ� �������̽� ��ü���� �޼ҵ� ȣ��.
	}

}
