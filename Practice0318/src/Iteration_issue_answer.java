import java.util.Random;

public class Iteration_issue_answer {
	public static void main(String[] args) {
		Random rand = new Random();
				
		int total = 0;
		
		for (int i = 0; i < 3; i++) {
			int randN = rand.nextInt(101);
			System.out.println("입력된 점수:" + randN);
			total = total + randN;
		}
		
		System.out.println("총점은"+total+"입니다.");
		
		double avr = 0;
		avr = (double) total / 3;
//		나누기 할때 반드시 double로 바꿔주자!
		
		System.out.println("평균은"+avr+"입니다.");
	}
}
