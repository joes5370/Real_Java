package study_0329;

public class Money_Box {
	public int totalCoin = 0; // ���� ������ �ִ� ��(�Ӽ���)
	public String name; // ������ �̸��ֱ� ,public�Ͻ� ������� ���������� ����
//	private String name; private�� ������ ���ο��� �żҵ带 ���ؼ��� ���氡��

	public void setName(String inputName) {
		name = inputName; // �̸� ���� �޼ҵ� �ۼ�
	}
	
//	public void setName(String name) {
//		this.name = name;     ���Ϳ� �ִ� �żҵ� ������ this (�������)
//	}

	public void deposit(int inputCoin) { // ���� ������ �� ����
		totalCoin = totalCoin + inputCoin; // ���� ������ �ִ� �ݾ� +���� �ݾ�
//		this.totalCoin = this.totalCoin+inputCoin �� ����

	}

	public void withdraw() {
		System.out.println("��ݾ�: " + totalCoin);
		totalCoin = 0;
	}
}