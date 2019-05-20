package Day190520_4;
//PDA 를 상속받고
//MP3, MobilePhone 을 구현
public class SmartPhone extends PDA implements MP3,MobilePhone{

	@Override
	public void sendCall() {
		System.out.println("전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화를 받습니다.");
	}

	@Override
	public void sendMessage() {
		System.out.println("메세지를 보냅니다.");
		
	}

	@Override
	public void receiveMessage() {
		System.out.println("메세지를 받습니다.");		
	}

	@Override
	public void play() {
		System.out.println("MP3를 재생합니다.");		
	}

	@Override
	public void stop() {
		System.out.println("MP3를 정지합니다.");		
	}



	
	//PDA를 상속받고 MP3, MobilePhone 을 구현하는 클래스
	
//	
//	SmartPhone(int BOTTONS) {
//		super(BOTTONS);
//	}
//
//	@Override
//	public void Tel() {
//		if(BOTTONS==1) {
//			System.out.println("전화를 받습니다.");	
//		}
//		else {
//			System.out.println("전화를 끊습니다.");
//		}
//		
//	}
//	@Override
//	public void MMS() {
//		if(BOTTONS==1) {
//		System.out.println("메세지를 보냅니다.");
//		}
//		else {
//			System.out.println("메세지를 받습니다.");
//		}
//		}
//
//	@Override
//	public void startstop() {
//		if(BOTTONS==1) {
//		System.out.println("음악 재생합니다.");
//		}
//		else {
//			System.out.println("음악 정지합니다.");
//		}
//		}
}
