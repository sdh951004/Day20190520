package Day190520_2;

public class Car{
	/*
	 * Tire Ÿ�� �ʵ� 4���� �����ؼ� ���� HankookTire ��ü ����
	 * run �޼ҵ� 
	 * =>������ ������ 4���� ������ ���� roll �޼ҵ带 ȣ���ϴ� �ڵ尡 ������.
	 */
		
	//Tire Ÿ�� �ʵ� 4�� �����ؼ� HankkokTire ��ü ����.
	Tire japan = new HankookTire();	
	Tire korea = new HankookTire();
	Tire germany = new HankookTire();
	Tire lamborgini = new HankookTire();
	
	
	//run�޼ҵ� ����
	//���� ������ 4���� ������ run �޼ҵ� �ȿ� ������ roll �޼ҵ带 ȣ��
	void run() {
		japan.roll();
		korea.roll();
		germany.roll();
		lamborgini.roll();
	}

	

}	


	
	


