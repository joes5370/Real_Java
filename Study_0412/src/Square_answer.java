import java.util.Scanner;

public class Square_answer {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a;
	
	Square s = new Square();
	Triangle R = new Triangle();
	
	System.out.println("���̸� ���� ���� ������: "+"1 :�ﰢ��"+"2 : ������");
	a = scan.nextInt();
	
	while(a != 1 || a !=2 )
	if(a == 1) {
		s.inputValue();
		break;
	}else if (a == 2) {
		R.inputValue();
		break;
	}else {
		System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
		a = scan.nextInt();
	}
}
}
