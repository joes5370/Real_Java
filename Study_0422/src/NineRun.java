import java.io.IOException;

public class NineRun {
	public static void main(String[] args) {
		System.out.println("구구단 게임을 시작합니다.");
		NineGame n = new NineGame();
		n.game();
		
		
		
		java.io.File file = new java.io.File("c:\\file.txt");
		try {
			file.getCanonicalFile();
		} catch (IOException e) {
			e.printStackTrace();
		}


		
	}
}
