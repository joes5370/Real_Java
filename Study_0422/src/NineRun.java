import java.io.IOException;

public class NineRun {
	public static void main(String[] args) {
		System.out.println("������ ������ �����մϴ�.");
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
