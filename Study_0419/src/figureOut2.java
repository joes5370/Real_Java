import java.util.Scanner;

public class figureOut2 implements Figure{
	double result;
	@Override
	public void inputValue() {
		System.out.println("정n각형의 넓이 구함.");
		System.out.print("n = ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print("변 : ");
		double a = s.nextDouble();
		double result = n / 4 / Math.tan(Math.toRadians(Math.PI / n));
		System.out.println("정" + n + "각형의 넓이 : " + this.result);
		
	}

	@Override
	public void printResult() {
		System.out.println("정n각형의 넓이 : " + this.result);
		
	}

}
