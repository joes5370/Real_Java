import java.util.Scanner;

public class Triangle extends Figure {

	public void inputValue() {
		double bottom;
		double height;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�غ�: ");
		bottom = scan.nextDouble();
		System.out.println("����: ");
		height = scan.nextDouble();
		
		System.out.println("�ﰢ���� ���̴�: "+ bottom * height * 0.5);
	}
}
