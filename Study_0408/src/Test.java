import java.util.Scanner;

public class Test {
	int number1 = 0;
	int number2 = 0;
	
	public void inputNumbers() {
		System.out.println("두개의 숫자를 입력해주세요.");
		System.out.println("첫번째 숫자입력");
		Scanner scan = new Scanner(System.in);
		this.number1 = scan.nextInt();
	
		System.out.println("두번째 숫자입력");
		this.number2 = scan.nextInt();
		
	}
	public void printResult() {
		System.out.println("입력된 숫자는 " + this.number1 + ", "+this.number2 + "입니다.");
	}
}
