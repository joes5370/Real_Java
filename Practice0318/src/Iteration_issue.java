
import java.util.Scanner;

public class Iteration_issue {
	public static void main(String[] args) {
		
		int p1;
		int sum = 0;
		int total_s = 3;
		double avr = 0;
		
		System.out.println("3명의 점수를 입력해 주세요");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < total_s; i++) {

			p1 = scan.nextInt();

			sum = sum + p1;

			avr = sum / total_s;

		}

		System.out.println("총점은:" + sum);
		System.out.println("평균은:" + avr);
	}

}
