import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
//	������
	Player(String name,int hp){
		this.name = name;
		this.hp = hp;
	}

	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;

	}

	public void beUnderattack() {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber == 1) {
			hp = hp - 10;
			System.out.println(this.name + "��(��) 10�� �������� �Ծ����ϴ�.");
		} else {
			System.out.println(this.name + "��(��) ȸ�ǿ� �����߽��ϴ�.");
		}
	}
}
