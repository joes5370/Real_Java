import java.util.Scanner;

public class NineGame_throw {
	private int dan;

	public void game() throws Exception {
//		ȣ��� ������ ���� ó�� �Ҷ� throws Exception�� ��� = ���� �� ���� ȣ�� �κп��� ó���Ѵ�.
//		�ٸ� 
		Scanner scan = new Scanner(System.in);
		System.out.println("�ܼ��� �Է����ּ���");
		String a = scan.nextLine();
		this.dan = Integer.parseInt(a);
		this.result();
	}

	private void result() {
//		 private�� ���� ȣ��
		for (int i = 1; i <= 9; i++) {
			int game = this.dan * i;
			System.out.println(this.dan + "X" + i + "=" + game);
		}
	}
}
