package Day190520;
//RemoteControl �������̽��� ����Ŭ������ ����
public class Television implements RemoteControl{
	//�������̽��� ����Ŭ������ �Ϲ�Ŭ������ ���� �ʵ�, ������, �޼ҵ带 ���� �� ������
	//�������̽����� ������ �߻�޼ҵ忡 ���� �����Ǵ� �� �ؾ���.
	
	//�ʵ� ����
	private int volume;
	//�߻�޼ҵ� ������
	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
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
		System.out.println("����Tv ����:"+volume);
	}
	
}
