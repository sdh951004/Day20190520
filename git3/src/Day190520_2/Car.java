package Day190520_2;

public class Car{
	/*
	 * Tire 타입 필드 4개를 선언해서 각각 HankookTire 객체 대입
	 * run 메소드 
	 * =>위에서 선언한 4개의 변수가 각각 roll 메소드를 호출하는 코드가 존재함.
	 */
		
	//Tire 타입 필드 4개 선언해서 HankkokTire 객체 대입.
	Tire japan = new HankookTire();	
	Tire korea = new HankookTire();
	Tire germany = new HankookTire();
	Tire lamborgini = new HankookTire();
	
	
	//run메소드 선언
	//위에 선언한 4개의 변수를 run 메소드 안에 각각의 roll 메소드를 호출
	void run() {
		japan.roll();
		korea.roll();
		germany.roll();
		lamborgini.roll();
	}

	

}	


	
	


