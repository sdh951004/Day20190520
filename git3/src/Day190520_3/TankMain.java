package Day190520_3;

public class TankMain {

	public static void main(String[] args) {
		//TankŬ���� ��ü�� ���� �޼ҵ� ȣ��.
		Tank tank = new Tank();
		tank.work();
		tank.fire();
		
		
		Car car;
		car= new Tank();
		car.work(); //Car �������̽� Ÿ���� �����̱� ������ work�޼ҵ常 ȣ�� ����
		
		Cannon cannon;
		cannon = new Tank();
		cannon.fire(); //Cannon �������̽� Ÿ���� �����̱� ������ fire �޼ҵ常 ȣ�� ����.
	}

}
