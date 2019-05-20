package Day190520_2;

public class CarMain {

	public static void main(String[] args) {
		//필드의 다형성 ~!!
		
		
		//Car 클래스를 객체로 만들어서 run 메소드를 호출함.
		Car car = new Car();
		car.run(); //한국타이어 객체를 대입하여 한국타이어 클래스의 출력문이 출력됨.
		
	
		
		
		//Car 클래스의 필드 중 2개에 KumhoTire 객체를 대입.
		car.japan = new KumhoTire();	//japan,jermany 변수인 현재 한국타이어 객체를 대입한 상태에서 금호타이어를 다시 대입하여 
		car.germany = new KumhoTire();	//금호타이어 객체 타입으로 변환되어 금호타이어 클래스문으로 출력됨	
		
		
		//Car 클래스 객체의  run메소드 호출.
		car.run();
	}

}
