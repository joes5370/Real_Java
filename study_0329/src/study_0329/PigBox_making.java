package study_0329;

public class PigBox_making {
	private int coin = 0;;

	public void inM(int coin, String message) {
		this.coin = this.coin + coin; // ������ ������ ���� ���� �ִ� ���ο� �ִ´�.
		if (message.equals("")) {
			System.out.println("���׶�");
		} else {
			System.out.println(message);
		}
	
	}
	
}
