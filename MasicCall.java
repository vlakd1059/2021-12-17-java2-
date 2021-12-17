package Exam01;

public class MasicCall implements Phone, Phone2 {
	// 자바에서의 상속은 다중상속이 불가능하지만
	// 단, 자바에서의 인터페이스를 상속받아서 구현하는 경우는 다중 상속이 가능하다.
	// 기존의 기능과 +빅스비

	@Override
	public void Call() {
		System.out.println();
	}

	@Override
	public void Message() {
		System.out.println();
	}

	@Override
	public void Camera() {
		System.out.println();
	}

	public void bixby() {
		System.out.println();
	}

}
