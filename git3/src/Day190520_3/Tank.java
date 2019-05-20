package Day190520_3;

public class Tank implements Car,Cannon{
	//Car,Cannon 인터페이스를 모두 구현하는 클래스
	//메소드는 알아서 정의.
		
	@Override
	public void fire() {
		System.out.println("발포~!!");
	}

	@Override
	public void work() {
		System.out.println("탱크가 서서히 가면서 발포 준비~!!");
	}
	
	
}
