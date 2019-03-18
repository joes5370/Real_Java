import java.util.Random;
import java.util.Scanner;

public class Com_dice {
public static void main(String[] args) {
	int user = 0 ;
	int com = 0 ;
	String s;
		
	System.out.println("화면에 주사위를 굴릴까요?");
	Scanner scan = new Scanner(System.in);
	s = scan.nextLine();
	
	for (int i = 0; i < 5000000; i++) {
		if (s.equals(""))//문자열 비교!!!!!!!
			{
			break;
		} else {
			System.out.println("Enter를 눌러주세요");
			s = scan.nextLine();
		} 
	}
	
	Random r = new Random();
	user = r.nextInt(6)+1;
	System.out.println("당신이 뽑은 주사위는: " + user);
	
	System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
	s = scan.nextLine();
	com = r.nextInt(6)+1;
	System.out.println("컴퓨터가 뽑은 주사위는: "+com);
	
	for (int i = 0; i < 50000000; i++) {
		if (s.equals("")) {
			break;
		}else {
			System.out.println("Enter를 입력해주세요");
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
