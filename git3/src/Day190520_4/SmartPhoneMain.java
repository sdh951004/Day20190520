package Day190520_4;

public class SmartPhoneMain {

	public static void main(String[] args) {
		//SmartPhone Ŭ���� ��ü�� ���� �� �޼ҵ� ȣ��.
//		SmartPhone phone;
//		phone= new SmartPhone(1);
//		phone.MMS();
//		phone.ADD();
//		phone.startstop();
//		phone.Tel();
//		System.out.println("----------------");
//		phone= new SmartPhone(0);
//		phone.MMS();
//		phone.startstop();
//		phone.Tel();
		//������ ����
		SmartPhone sp=new SmartPhone();
		sp.sendCall();
		sp.receiveCall();
		sp.sendMessage();
		sp.receiveMessage();
		sp.play();
		sp.stop();
		System.out.println(sp.plus(6, 5));
	}

}
