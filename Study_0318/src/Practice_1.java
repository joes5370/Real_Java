import java.util.Scanner;

public class Practice_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int stuNber = 0;
		int s = 0;
		int sum = 0;
		double avr = 0;
		
		System.out.println("�л����� �Է����ּ���");
		stuNber = scan.nextInt();
		
		for (int i = 0; i < stuNber; i++) {
			System.out.println("������ �Է��� �ּ���");
			s = scan.nextInt();
			sum = sum + s;
		}
		avr = (double)sum / stuNber;
		System.out.println("������ :"+sum+" "+"����� :"+avr);
		
		
		
	}
}
