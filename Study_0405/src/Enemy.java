import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;
	Enemy(String name, int hp){
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
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			hp = hp - 10;
			System.out.println(this.name+"��(��) 10�� ���ظ� �Ծ����ϴ�.");
		} else {
			System.out.println(this.name +"��(��) ȸ���߽��ϴ�.");
		}
	}

}
