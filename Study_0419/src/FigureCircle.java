import java.util.Scanner;

public class FigureCircle implements Figure {
	
	double r = 0;
	double circleArea = 0;
	@Override
	public void inputValue() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�������� �Է��� �ּ���! (cm)");
		this.r = s.nextDouble();
		this.circleArea = Math.PI * Math.pow(this.r, 2);
		
	}

	@Override
	public void printResult() {
		System.out.println("���� ���� : "+ this.circleArea);
		
	}

}
