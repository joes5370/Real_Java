import java.util.Scanner;

public class aaa {
	int number1 = 0;
	int number2 = 0;
	
	public void Number() {
		System.out.println("숫자를 입력해 주세요");
		System.out.println("첫번째 숫자를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		this.number1 = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력해 주세요");
		this.number2 = scan.nextInt();
	}
	public void result() {
		System.out.println("입력한 숫자는: "+this.number1+","+this.number2+"입니다.");
	}
}
