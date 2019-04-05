import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Player[] player = new Player[5];
		player[0] = new Player("�丣", 10);
		player[1] = new Player("�����̴���", 10);
		player[2] = new Player("���̾��", 10);
		player[3] = new Player("ȣũ����", 11);
		player[4] = new Player("ĸƾ�Ƹ޸�ī", 21);

		Enemy[] enemy = new Enemy[5];
		enemy[0] = new Enemy("�ڹ�", 100);
		enemy[1] = new Enemy("���̽�", 10);
		enemy[2] = new Enemy("���", 90);
		enemy[3] = new Enemy("����Ʈ�׷�", 120);
		enemy[4] = new Enemy("����", 200);

		Scanner scan = new Scanner(System.in);
		System.out.println("�� ������ ���͸� ��������.");
		for (int i = 0; i < 20; i++) {
			scan.nextLine();

			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					enemy[j].beUnderattack();
				}
				
			}
			System.out.println("����");

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
			System.out.println("���� �̰���ϴ�.");
		} else if (enemyCount < playerCount) {
			System.out.println("�÷��̾ �̰���ϴ�.");
		} else {
			System.out.println("�����ϴ�.");
		}

	}
}
