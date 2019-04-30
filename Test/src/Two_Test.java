import java.util.Scanner;

public class Two_Test {
	public void two() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		String inputN = scan.nextLine();
		int inputNumber = Integer.parseInt(inputN);
		int sum = 0;
		int multiple = 1;

		for (int i = 1; i <= inputNumber; i++) {
			sum += i;
			multiple = multiple * i;
		}
		System.out.println("입력받은 숫자의 합은:  " + sum + "숫자의 곱은: " + multiple);

	}
}
