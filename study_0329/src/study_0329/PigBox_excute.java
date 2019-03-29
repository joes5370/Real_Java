package study_0329;

import java.util.Scanner;

public class PigBox_excute {
	public static void main(String[] args) {
		PigBox_making Money = new PigBox_making();
		Scanner scanner = new Scanner(System.in);
		
	for (int i=0; i < 99999; i++) {	
		System.out.print("입금할 금액: ");
		int coin = scanner.nextInt();
		System.out.print("메세지: ");
		scanner.nextLine();
		String message = scanner.nextLine();
		Money.inM(coin,message);
		if(message.equals("crash")) {
			break;
		}
	}
//		Money.inM(100, ""); // 안넣었을 때는 빈칸 넣을 때는 어떤 메세지
//		Money.inM(100, "용돈");

	}
}
