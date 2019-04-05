import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Player[] player = new Player[5];
		player[0] = new Player("토르", 10);
		player[1] = new Player("스파이더맨", 10);
		player[2] = new Player("아이언맨", 10);
		player[3] = new Player("호크아이", 11);
		player[4] = new Player("캡틴아메리카", 21);

		Enemy[] enemy = new Enemy[5];
		enemy[0] = new Enemy("자바", 100);
		enemy[1] = new Enemy("파이썬", 10);
		enemy[2] = new Enemy("토드", 90);
		enemy[3] = new Enemy("포스트그래", 120);
		enemy[4] = new Enemy("아톰", 200);

		Scanner scan = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 누르세요.");
		for (int i = 0; i < 20; i++) {
			scan.nextLine();

			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					enemy[j].beUnderattack();
				}
				
			}
			System.out.println("하이");

			for (int j = 0; j < player.length; j++) {
				if (player[j].status()) {
					player[j].beUnderattack();
				}
			}
		}

		int enemyCount = 0;
		for (int j = 0; j < enemy.length; j++) {
			if (enemy[j].status()) {
				enemyCount++;
			}
		}
		int playerCount = 0;
		for (int j = 0; j < player.length; j++) {
			if (player[j].status()) {
				playerCount++;
			}
		}

		if (enemyCount > playerCount) {
			System.out.println("적이 이겼습니다.");
		} else if (enemyCount < playerCount) {
			System.out.println("플레이어가 이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}

	}
}
