package Exam01;

public class Lollipop implements Phone {
	// �������̽��� ��ӹ����� implements ��� Ű���带 ���

	@Override
	public void Call() {
		System.out.println("��ȭ�� �ɴ�");

	}

	@Override
	public void Message() {
		System.out.println("�޽����� ������");

	}

	@Override
	public void Camera() {
		System.out.println("ī�޶� ���");

	}

}
