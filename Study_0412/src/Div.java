import java.util.Scanner;

public class Div {
	int number1 = 0;
	int number2 = 0;
	public void inputNumber() {
		Scanner scanner = new Scanner(System.in);
		String tmp;
		System.out.println("����1�Է�: ");
		tmp = scanner.nextLine();
		try {
			this.number1 = Integer.parseInt(tmp);
		} catch (Exception e) {
			this.number1 = 0;
		}
		System.out.println("����2�Է�: ");
		tmp = scanner.nextLine();
		try {
			this.number2 = Integer.parseInt(tmp);
		} catch (Exception e) {
			this.number2 = 0;
		}
	}
	public void printResult() {
		double resultNumber = 0;
		resultNumber = (double)this.number1 / this.number2;
		resultNumber = (double)Math.round(resultNumber * 100) / 100;
		System.out.println("" + this.number1 + "������" + this.number2 + " = " + resultNumber + "�Դϴ�.");
	}
}
