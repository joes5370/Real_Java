import java.util.Scanner;

public class SumNumber {
//	class�̸� �� ������ �����

	public void doSum() {
//	���� ��Ű�� �� �����(method), �������� �����ϴ�.

		int number1 = 0;
		int number2 = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("���� : ");
		number1 = scan.nextInt();

		System.out.print("���� : ");
		number2 = scan.nextInt();
		
		Sum2 sum2 = new Sum2();
		int result = sum2.sumNumbers(number1, number2);
		System.out.println("�ΰ��� ������ ���� : " + result + "�Դϴ�.");
//		���ϴ� Ŭ������ �ϳ� �� ���� ���.
	}

	
	
	
//	public void hello() {
//		������ �����ϴٴ� ��(method)
//		System.out.println("Hello Java");
//	}
		
}
