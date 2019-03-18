import java.util.Scanner;

public class Practice_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int stuNber = 0;
		int s = 0;
		int sum = 0;
		double avr = 0;
		
		System.out.println("학생수를 입력해주세요");
		stuNber = scan.nextInt();
		
		for (int i = 0; i < stuNber; i++) {
			System.out.println("점수를 입력해 주세요");
			s = scan.nextInt();
			sum = sum + s;
		}
		avr = (double)sum / stuNber;
		System.out.println("총합은 :"+sum+" "+"평균은 :"+avr);
		
		
		
	}
}
