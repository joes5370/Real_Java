import java.util.Scanner;

public class NineGame {
	private int dan;

	public void game() {
		Scanner s = new Scanner(System.in);
		System.out.println("단수를 입력해주세요");
		String a = s.nextLine();

		try {
			this.dan = Integer.parseInt(a);
//			this.result(); - 여기에 넣게 되면 오류시 아무것도 안뜬다.
		} catch (Exception e) {
			e.printStackTrace();
			// 오류 정보 출력
		}

		this.result();
	}

	private void result() {
		// 내부 호출
		for (int i = 1; i <= 9; i++) {
			int game = this.dan * i;
			System.out.println(this.dan + "X" + i + "=" + game);
		}
	}
}
