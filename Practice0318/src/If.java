import java.util.Random;
import java.util.Scanner;

public class If {
public static void main(String[] args) {
	int a = 0;
	int b = 0; 
	int c = 0;
	
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("a�������� �Է����ּ���");
	a = scan.nextInt();
	b = r.nextInt(101);
	System.out.println("���������� ������:"+b);
	System.out.println("c�������� �Է����ּ���");
	c = scan.nextInt();
	

	if (a > b && a > c && b > c) {
		System.out.println("1�� : a "+"2��:b "+"3�� : c" );
	}else if (a > b && a > c && c > b) {
		System.out.println("1�� : a "+"2�� :b "+"3�� : c");
	}else if (b > a && b > c && a > c) {
		System.out.println("1�� : b "+"2�� :a "+"3�� : c");
	}else if (b > a && b > c && c > a) {
		System.out.println("1�� : b "+"2�� :c "+"3�� : a");
	}else if (c > a && c > b && a > b) {
		System.out.println("1�� : c "+"2�� :a "+"3�� : b");
	}else if (c > a && c > b && b > a) {
		System.out.println("1�� : c "+"2�� :b "+"3�� : a");
	}else {
		System.out.println("����");
	}
	
}
}
