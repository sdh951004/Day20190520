package Day190520_4;
//PDA �� ��ӹް�
//MP3, MobilePhone �� ����
public class SmartPhone extends PDA implements MP3,MobilePhone{

	@Override
	public void sendCall() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �޽��ϴ�.");
	}

	@Override
	public void sendMessage() {
		System.out.println("�޼����� �����ϴ�.");
		
	}

	@Override
	public void receiveMessage() {
		System.out.println("�޼����� �޽��ϴ�.");		
	}

	@Override
	public void play() {
		System.out.println("MP3�� ����մϴ�.");		
	}

	@Override
	public void stop() {
		System.out.println("MP3�� �����մϴ�.");		
	}



	
	//PDA�� ��ӹް� MP3, MobilePhone �� �����ϴ� Ŭ����
	
//	
//	SmartPhone(int BOTTONS) {
//		super(BOTTONS);
//	}
//
//	@Override
//	public void Tel() {
//		if(BOTTONS==1) {
//			System.out.println("��ȭ�� �޽��ϴ�.");	
//		}
//		else {
//			System.out.println("��ȭ�� �����ϴ�.");
//		}
//		
//	}
//	@Override
//	public void MMS() {
//		if(BOTTONS==1) {
//		System.out.println("�޼����� �����ϴ�.");
//		}
//		else {
//			System.out.println("�޼����� �޽��ϴ�.");
//		}
//		}
//
//	@Override
//	public void startstop() {
//		if(BOTTONS==1) {
//		System.out.println("���� ����մϴ�.");
//		}
//		else {
//			System.out.println("���� �����մϴ�.");
//		}
//		}
}
