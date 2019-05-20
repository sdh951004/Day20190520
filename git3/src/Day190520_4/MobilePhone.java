package Day190520_4;

public interface MobilePhone extends Phone {
	// Phone interface 상속 받음.
	// 메세지를 보내고 받는 기능이 있음.

	//void MMS();

	
	 // 교수님 버전 
	  void sendMessage(); 
	  void receiveMessage();
	 

}
