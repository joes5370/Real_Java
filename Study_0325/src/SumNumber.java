import java.util.Scanner;

public class SumNumber {
//	class이름 및 설계목록 만들기

	public void doSum() {
//	일을 시키는 거 만들기(method), 여러개도 가능하다.

		int number1 = 0;
		int number2 = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 : ");
		number1 = scan.nextInt();

		System.out.print("숫자 : ");
		number2 = scan.nextInt();
		
		Sum2 sum2 = new Sum2();
		int result = sum2.sumNumbers(number1, number2);
		System.out.println("두개의 숫자의 합은 : " + result + "입니다.");
//		더하는 클래스를 하나 더 만들어서 사용.
	}

	
	
	
//	public void hello() {
//		여러개 가능하다는 것(method)
//		System.out.println("Hello Java");
//	}
		
}
