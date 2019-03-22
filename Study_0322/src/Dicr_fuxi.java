import java.util.Random;
import java.util.Scanner;

public class Dicr_fuxi {
	public static void main(String[] args) {
		int comDice = 0;
		int userDice = 0;

		Random rand = new Random();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("사용자의 주사위를 굴릴까요? (종료하시려면 q을 입력하세요)");
			String inputString = s.nextLine();
			if (inputString.equalsIgnoreCase("q")) {
//		문자열이 아닌 부분을 비교시 무시해서 비교가 가능하게 하는 경우 사용
				System.out.println("게임이 종료되었습니다.");
				break;
			}

			userDice = rand.nextInt(6) + 1;
			System.out.println("사용자의 주사위는" + userDice + "입니다.");

			System.out.println("컴퓨터의 주사위를 굴려주세요");
			s.nextLine();
			comDice = rand.nextInt(6) + 1;
			System.out.println("컴퓨터의 주사위는" + comDice + "입니다.");

			if (comDice == userDice) {
				System.out.println("비겼습니다.");
			} else if (comDice > userDice) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (comDice < userDice)
				System.out.println("당신이 이겼습니다.");
		}

	}
}
