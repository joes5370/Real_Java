import java.util.Scanner;

public class figureOut1 implements Figure{

	double result;
	@Override
	public void inputValue() {
		System.out.println("사각형의 넓이를 구합니다.");
		System.out.println("밑변 : ");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("높이 : ");
		double h = s.nextDouble();
		this.result = a * h;
		System.out.println("사각형의 넓이는"+this.result);
	}

	@Override
	public void printResult() {
		System.out.println("사각형의 넓이 : "+ this.result);
	}

}
