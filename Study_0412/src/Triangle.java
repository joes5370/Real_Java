import java.util.Scanner;

public class Triangle extends Figure {

	public void inputValue() {
		double bottom;
		double height;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("¹Øº¯: ");
		bottom = scan.nextDouble();
		System.out.println("³ôÀÌ: ");
		height = scan.nextDouble();
		
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ´Â: "+ bottom * height * 0.5);
	}
}
