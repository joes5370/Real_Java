
public class NineThrowRun {
	public static void main(String[] args) {
		NineGame_throw f = new NineGame_throw();
		try {
			f.game();
		} catch (Exception e) {
			System.out.println("game에서 오류발생");			
		}
		
	}

}
