package Exam01;

public interface Phone {
	// 인터페이스의 변수는 고정된 값만 올수있다. -> 변경 불가능
	// final은 생략 가능

	// 통화기능
	public abstract void Call();

	// 인터페이스에서 일반 메소드는 만들수 없다.
	// 무조건 추상메소드로 인식하기때문에
	// public abstract 생략가능
	void Message(); // (defalut abstract)생략

	// 마이크
	int mic = 2;
	String name = "건하";

	// 사진찍기
	public abstract void Camera();

	// 버튼
	int button = 12;

	// 스피커
	int speaker = 4;

}
