import java.util.Scanner;

public class NineGame {
	private int dan;

	public void game() {
		Scanner s = new Scanner(System.in);
		System.out.println("�ܼ��� �Է����ּ���");
		String a = s.nextLine();

		try {
			this.dan = Integer.parseInt(a);
//			this.result(); - ���⿡ �ְ� �Ǹ� ������ �ƹ��͵� �ȶ��.
		} catch (Exception e) {
			e.printStackTrace();
			// ���� ���� ���
		}

		this.result();
	}

	private void result() {
		// ���� ȣ��
		for (int i = 1; i <= 9; i++) {
			int game = this.dan * i;
			System.out.println(this.dan + "X" + i + "=" + game);
		}
	}
}
