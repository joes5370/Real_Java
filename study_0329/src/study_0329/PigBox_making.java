package study_0329;

public class PigBox_making {
	private int coin = 0;;

	public void inM(int coin, String message) {
		this.coin = this.coin + coin; // 코인이 들어오고 내가 갖고 있는 코인에 넣는다.
		if (message.equals("")) {
			System.out.println("땡그랑");
		} else {
			System.out.println(message);
		}
	
	}
	
}
