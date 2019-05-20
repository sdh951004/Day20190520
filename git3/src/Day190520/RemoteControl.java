package Day190520;

public interface RemoteControl {
	/*
	 * 인터페이스(interfase)(실행을 위한것이 아닌 실행클래스를 만들기 위한 뼈대역할)
	 * 1. 인터페이스는 main 코드와 객체간의 접점 역할을 함.
	 * 2. 객체의 다형성을 구현하는데 용이함.
	 * 3. 인터페이스의 구성 요소
	 * 3-1. 상수 필드만 선언이 가능함.
	 * 3-1-1.일반적인 필드로 선언해도 컴파일 과정에서 static final이 자동으로 붙음.
	 * 3-2. 추상메소드를 가짐.
	 * 3-3. 디폴트 메소드 가짐.
	 * 3-3-1.접근제한 default가 아니라 기본으로 가지고 있는 메소드 개념.
	 * 3-4 정적(static) 메소드 가짐.
	 * 3-4-1.인터페이스를 객체화 하지 않고도 직접 호출 가능
	 */
	
	//필드 선언
	//인터페이스는 상수 필드만 가짐.
	//static final을 붙이지 않아도 자동으로 적용됨.
	public int MAX_VOLUME=1;
	public int MIN_VOLUME=0;
	
	//메소드 선언
	//인터페이스에는 추상메소드 선언만 가능
	//자동으로 abstract가 적용됨.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트메소드 선언
	//접근제한자 default와는 다른 default이다.즉, public 기능을 한다.
	//인터페이스에서만 적용되는 개념이며, 인터페이스가 실행내용을 가지고 있는 메소드를 정의할 때 사용.
	default void setMute(boolean mute) {	//default라고 안쓰면 추상 메소드로 되서 에러 뜬다. 즉, public 기능을 한다.
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}
		else {
			System.out.println("무음 해제 합니다.");
		}
	}
	//정적(Static)메소드 선언 =? 지양한다. => 즉, 되도록이면 안쓰는게 좋다.
	static void changeBattery() {//static메소드는 객체화 하지 않고도 직접 접근이 가능한 메소드이다.
		System.out.println("건전지를 교환합니다.");
	}
	
}
