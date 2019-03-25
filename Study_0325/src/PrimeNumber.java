import java.util.Scanner;

public class PrimeNumber {
	public void doCheck() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("검사할 숫자를 입력해주세요");
		int inputN = scanner.nextInt();
		if (inputN<1) {
//			음수인지 아닌지 확인
			System.out.print("양수만 입력해 주세요.");
			return;
//			return에서 끝낸다.
		}
		
		
		boolean isprimeN = true;
		for(int i = 2; i < inputN / 2; i++) {
			if(inputN % i ==0) {
				isprimeN = false;
				break;
//				쓸때없는 연산을 막아준다
			}
		}
		
				
		if(isprimeN) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	
		
	}
}
