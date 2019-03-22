import java.util.Arrays;
import java.util.Scanner;

public class Arrangement_withPropessor {
	public static void main(String[] args) {
		int[] korScore = new int[10];
//		int형 10칸을 만들꺼야

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < korScore.length; i++) {
			System.out.print("국어점수: ");
			korScore[i] = scan.nextInt();
		}

		System.out.println(Arrays.toString(korScore));
//		Arrats.toString()은 배열과 같게 출력하기 위해 써준다

		int total = 0;
		double avr = 0;

		for (int i = 0; i < korScore.length; i++) {
			total = total + korScore[i];
		}
		avr = (double) total / korScore.length;

		System.out.println("총점은 : " + total + "평균은: " + avr);

	}
}
