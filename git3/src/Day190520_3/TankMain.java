package Day190520_3;

public class TankMain {

	public static void main(String[] args) {
		//Tank클래스 객체로 만들어서 메소드 호출.
		Tank tank = new Tank();
		tank.work();
		tank.fire();
		
		
		Car car;
		car= new Tank();
		car.work(); //Car 인터페이스 타입의 변수이기 때문에 work메소드만 호출 가능
		
		Cannon cannon;
		cannon = new Tank();
		cannon.fire(); //Cannon 인터페이스 타입의 변수이기 떄문에 fire 메소드만 호출 가능.
	}

}
