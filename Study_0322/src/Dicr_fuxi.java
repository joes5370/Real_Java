import java.util.Random;
import java.util.Scanner;

public class Dicr_fuxi {
	public static void main(String[] args) {
		int comDice = 0;
		int userDice = 0;

		Random rand = new Random();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("������� �ֻ����� �������? (�����Ͻ÷��� q�� �Է��ϼ���)");
			String inputString = s.nextLine();
			if (inputString.equalsIgnoreCase("q")) {
//		���ڿ��� �ƴ� �κ��� �񱳽� �����ؼ� �񱳰� �����ϰ� �ϴ� ��� ���
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}

			userDice = rand.nextInt(6) + 1;
			System.out.println("������� �ֻ�����" + userDice + "�Դϴ�.");

			System.out.println("��ǻ���� �ֻ����� �����ּ���");
			s.nextLine();
			comDice = rand.nextInt(6) + 1;
			System.out.println("��ǻ���� �ֻ�����" + comDice + "�Դϴ�.");

			if (comDice == userDice) {
				System.out.println("�����ϴ�.");
			} else if (comDice > userDice) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else if (comDice < userDice)
				System.out.println("����� �̰���ϴ�.");
		}

	}
}
