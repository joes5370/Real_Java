import java.util.Scanner;

public class Square extends Figure {

	@Override
	public void inputValue() {
		Scanner scan = new Scanner(System.in);
		
		double a;
		double b;
		System.out.println("대각선1의 길이는: ");
		a = scan.nextDouble();
		System.out.println("대각선2의 길이는: ");
		b = scan.nextDouble();
		
		System.out.println("마름모의 넓이는 : " + 0.5 * a * b);
		
	}

}
