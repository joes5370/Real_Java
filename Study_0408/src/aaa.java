import java.util.Scanner;

public class aaa {
	int number1 = 0;
	int number2 = 0;
	
	public void Number() {
		System.out.println("���ڸ� �Է��� �ּ���");
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		this.number1 = scan.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		this.number2 = scan.nextInt();
	}
	public void result() {
		System.out.println("�Է��� ���ڴ�: "+this.number1+","+this.number2+"�Դϴ�.");
	}
}
