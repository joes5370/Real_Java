import java.util.Scanner;

public class figureOut1 implements Figure{

	double result;
	@Override
	public void inputValue() {
		System.out.println("�簢���� ���̸� ���մϴ�.");
		System.out.println("�غ� : ");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("���� : ");
		double h = s.nextDouble();
		this.result = a * h;
		System.out.println("�簢���� ���̴�"+this.result);
	}

	@Override
	public void printResult() {
		System.out.println("�簢���� ���� : "+ this.result);
	}

}
