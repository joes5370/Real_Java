import java.util.Random;

public class Swich {
	public static void main(String[] args) {

		int rCom;

		Random rand = new Random();
		rCom = rand.nextInt(6) + 1;

		System.out.println("주사위 게임을 시작하겠습니다");
		System.out.println(rCom);

		switch (rCom) {
		case 1:
			System.out.println("멍멍");
			break;
		case 2:
			System.out.println("야옹");
			break;
		case 3:
			System.out.println(3);
			break;
		case 4 :
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		default:
			System.out.println(6);
		}

	}

}
