import java.util.Scanner;

public class PrimeNumber {
	public void doCheck() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�˻��� ���ڸ� �Է����ּ���");
		int inputN = scanner.nextInt();
		if (inputN<1) {
//			�������� �ƴ��� Ȯ��
			System.out.print("����� �Է��� �ּ���.");
			return;
//			return���� ������.
		}
		
		
		boolean isprimeN = true;
		for(int i = 2; i < inputN / 2; i++) {
			if(inputN % i ==0) {
				isprimeN = false;
				break;
//				�������� ������ �����ش�
			}
		}
		
				
		if(isprimeN) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	
		
	}
}
