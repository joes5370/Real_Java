import java.util.Random;
import java.util.Scanner;

public class Com_dice {
public static void main(String[] args) {
	int user = 0 ;
	int com = 0 ;
	String s;
		
	System.out.println("ȭ�鿡 �ֻ����� �������?");
	Scanner scan = new Scanner(System.in);
	s = scan.nextLine();
	
	for (int i = 0; i < 5000000; i++) {
		if (s.equals(""))//���ڿ� ��!!!!!!!
			{
			break;
		} else {
			System.out.println("Enter�� �����ּ���");
			s = scan.nextLine();
		} 
	}
	
	Random r = new Random();
	user = r.nextInt(6)+1;
	System.out.println("����� ���� �ֻ�����: " + user);
	
	System.out.println("��ǻ�Ͱ� �ֻ����� �����ϴ�. �����ұ��?");
	s = scan.nextLine();
	com = r.nextInt(6)+1;
	System.out.println("��ǻ�Ͱ� ���� �ֻ�����: "+com);
	
	for (int i = 0; i < 50000000; i++) {
		if (s.equals("")) {
			break;
		}else {
			System.out.println("Enter�� �Է����ּ���");
			s = scan.nextLine();
		}
	}
	
	
	if (user > com) {
		System.out.println("You Win!");
	}else if (user < com) {
		System.out.println("You Lose!");
	} else if (user == com) {
		System.out.println("Draw");
	} else {
		System.out.println("Replay");
	}
	
	
}
}
