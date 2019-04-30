import java.util.Scanner;

public class NineGame_throw {
	private int dan;

	public void game() throws Exception {
//		호출된 곳에서 예외 처리 할때 throws Exception을 사용 = 가장 최 상위 호출 부분에서 처리한다.
//		다만 
		Scanner scan = new Scanner(System.in);
		System.out.println("단수를 입력해주세요");
		String a = scan.nextLine();
		this.dan = Integer.parseInt(a);
		this.result();
	}

	private void result() {
//		 private는 내부 호출
		for (int i = 1; i <= 9; i++) {
			int game = this.dan * i;
			System.out.println(this.dan + "X" + i + "=" + game);
		}
	}
}
