import java.util.Scanner;

public class Test {
	int number1 = 0;
	int number2 = 0;
	
	public void inputNumbers() {
		System.out.println("�ΰ��� ���ڸ� �Է����ּ���.");
		System.out.println("ù��° �����Է�");
		Scanner scan = new Scanner(System.in);
		this.number1 = scan.nextInt();
	
		System.out.println("�ι�° �����Է�");
		this.number2 = scan.nextInt();
		
	}
	public void printResult() {
		System.out.println("�Էµ� ���ڴ� " + this.number1 + ", "+this.number2 + "�Դϴ�.");
	}
}
