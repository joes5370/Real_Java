import java.util.Scanner;

public class Data_propessor {
	String name;
	int korS;
	int engS;
	int mathS;
	static int korTotal = 0;
	static int engTotal = 0;
	static int mathTotal= 0;
	
	public void inputScore() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		this.name = scan.nextLine();
		
		System.out.println("국어점수: ");
		String tmp = scan.nextLine();
		this.korS = Integer.parseInt(tmp);
		
		System.out.println("영어점수: ");
		tmp = scan.nextLine();
		this.engS = Integer.parseInt(tmp);
		
		System.out.println("수학점수: ");
		tmp = scan.nextLine();
		this.mathS = Integer.parseInt(tmp);
	}
}
