package study_0329;

public class Mbox_excute {
	public static void main(String[] args) {
		Money_Box box1 = new Money_Box();
		Money_Box box2 = new Money_Box();

		box1.setName("����������");
//		box1.name = "sfsfdf";  �̸��̶�� ���� ���� ���� ����
		box2.setName("��ũ����������");

		box1.withdraw();
		box2.withdraw();
		
//		box1.deposit(100);
//		box1.deposit(10);
//		box2.deposit(200);

//		box1.withdraw();
//		box1.deposit(10);
//		System.out.println(box1.totalCoin);
//		System.out.println(box2.totalCoin);
	}
}
