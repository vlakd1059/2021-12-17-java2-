package Exam01;

public interface Phone {
	// �������̽��� ������ ������ ���� �ü��ִ�. -> ���� �Ұ���
	// final�� ���� ����

	// ��ȭ���
	public abstract void Call();

	// �������̽����� �Ϲ� �޼ҵ�� ����� ����.
	// ������ �߻�޼ҵ�� �ν��ϱ⶧����
	// public abstract ��������
	void Message(); // (defalut abstract)����

	// ����ũ
	int mic = 2;
	String name = "����";

	// �������
	public abstract void Camera();

	// ��ư
	int button = 12;

	// ����Ŀ
	int speaker = 4;

}
