package Day190520_2;

public class CarMain {

	public static void main(String[] args) {
		//�ʵ��� ������ ~!!
		
		
		//Car Ŭ������ ��ü�� ���� run �޼ҵ带 ȣ����.
		Car car = new Car();
		car.run(); //�ѱ�Ÿ�̾� ��ü�� �����Ͽ� �ѱ�Ÿ�̾� Ŭ������ ��¹��� ��µ�.
		
	
		
		
		//Car Ŭ������ �ʵ� �� 2���� KumhoTire ��ü�� ����.
		car.japan = new KumhoTire();	//japan,jermany ������ ���� �ѱ�Ÿ�̾� ��ü�� ������ ���¿��� ��ȣŸ�̾ �ٽ� �����Ͽ� 
		car.germany = new KumhoTire();	//��ȣŸ�̾� ��ü Ÿ������ ��ȯ�Ǿ� ��ȣŸ�̾� Ŭ���������� ��µ�	
		
		
		//Car Ŭ���� ��ü��  run�޼ҵ� ȣ��.
		car.run();
	}

}
