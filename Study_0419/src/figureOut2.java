import java.util.Scanner;

public class figureOut2 implements Figure{
	double result;
	@Override
	public void inputValue() {
		System.out.println("��n������ ���� ����.");
		System.out.print("n = ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print("�� : ");
		double a = s.nextDouble();
		double result = n / 4 / Math.tan(Math.toRadians(Math.PI / n));
		System.out.println("��" + n + "������ ���� : " + this.result);
		
	}

	@Override
	public void printResult() {
		System.out.println("��n������ ���� : " + this.result);
		
	}

}
