package study_0329;

import java.util.Scanner;

public class PigBox_excute {
	public static void main(String[] args) {
		PigBox_making Money = new PigBox_making();
		Scanner scanner = new Scanner(System.in);
		
	for (int i=0; i < 99999; i++) {	
		System.out.print("�Ա��� �ݾ�: ");
		int coin = scanner.nextInt();
		System.out.print("�޼���: ");
		scanner.nextLine();
		String message = scanner.nextLine();
		Money.inM(coin,message);
		if(message.equals("crash")) {
			break;
		}
	}
//		Money.inM(100, ""); // �ȳ־��� ���� ��ĭ ���� ���� � �޼���
//		Money.inM(100, "�뵷");

	}
}
