package Exam01;

public class Lollipop implements Phone {
	// 인터페이스를 상속받을땐 implements 라는 키워드를 사용

	@Override
	public void Call() {
		System.out.println("전화를 걸다");

	}

	@Override
	public void Message() {
		System.out.println("메시지를 보내다");

	}

	@Override
	public void Camera() {
		System.out.println("카메라 찍다");

	}

}
