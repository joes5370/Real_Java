
import java.util.Scanner;

public class issue {
	public static void main(String[] args) {
		int p1; // 철수
		int p2; // 영희
		int p3; // 수영
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해 주세요(총3명)");
		System.out.println("철수의 국어점수 : ");
		p1 = scan.nextInt();
		System.out.println("영희의 국어점수 : ");
		p2 = scan.nextInt();
		System.out.println("수영의 국어점수 : ");
		p3 = scan.nextInt();
		
		System.out.println("입력 받은 점수 철수" + p1 +"점" + "영희" + p2 + "점" + "수영" + p3 + "점");
		
		if (p1 > p2 && p1 > p3 && p2 > p3) {
//			1,2,3
			System.out.println("1등 : 철수 ("+p1+"점)");
			System.out.println("2등 : 영희 ("+p2+"점)");
			System.out.println("3등 : 수영 ("+p3+"점)");
		}else if (p1 > p2 && p1 > p3 && p3 > p2) {
//			1,3,2
			System.out.println("1등 : 철수 ("+p1+"점)");
			System.out.println("2등 : 수영 ("+p3+"점)");
			System.out.println("3등 : 영희 ("+p2+"점)");
		}else if (p2 > p1 && p2 > p3 && p1 > p3) {
//			2,1,3
			System.out.println("1등 : 영희 ("+p2+"점)");
			System.out.println("2등 : 수영 ("+p3+"점)");
			System.out.println("3등 : 철수 ("+p1+"점)");
		}else if (p2 > p1 && p2 > p3 && p3 > p1) {
//			2,3,1
			System.out.println("1등 : 영희 ("+p2+"점)");
			System.out.println("2등 : 철수 ("+p1+"점)");
			System.out.println("3등 : 수영 ("+p3+"점)");
		}else if (p3 > p1 && p3 > p2 && p1 > p2) {
//			3,1,2
			System.out.println("1등 : 수영 ("+p3+"점)");
			System.out.println("2등 : 철수 ("+p1+"점)");
			System.out.println("3등 : 영희 ("+p2+"점)");
		}else if (p3 > p1 && p3 > p2 && p2 > p1) {
//			3,2,1
			System.out.println("1등 : 수영 ("+p3+"점)");
			System.out.println("2등 : 영희 ("+p2+"점)");
			System.out.println("3등 : 철수 ("+p1+"점)");
		}

	}
}

