import java.util.Scanner;

public class Square extends Figure {

	@Override
	public void inputValue() {
		Scanner scan = new Scanner(System.in);
		
		double a;
		double b;
		System.out.println("�밢��1�� ���̴�: ");
		a = scan.nextDouble();
		System.out.println("�밢��2�� ���̴�: ");
		b = scan.nextDouble();
		
		System.out.println("�������� ���̴� : " + 0.5 * a * b);
		
	}

}
