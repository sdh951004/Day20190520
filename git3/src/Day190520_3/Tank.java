package Day190520_3;

public class Tank implements Car,Cannon{
	//Car,Cannon �������̽��� ��� �����ϴ� Ŭ����
	//�޼ҵ�� �˾Ƽ� ����.
		
	@Override
	public void fire() {
		System.out.println("����~!!");
	}

	@Override
	public void work() {
		System.out.println("��ũ�� ������ ���鼭 ���� �غ�~!!");
	}
	
	
}
