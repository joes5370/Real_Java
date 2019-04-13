import java.util.Scanner;

public class Square_answer {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a;
	
	Square s = new Square();
	Triangle R = new Triangle();
	
	System.out.println("넓이를 구할 것을 고르세요: "+"1 :삼각형"+"2 : 마름모");
	a = scan.nextInt();
	
	while(a != 1 || a !=2 )
	if(a == 1) {
		s.inputValue();
		break;
	}else if (a == 2) {
		R.inputValue();
		break;
	}else {
		System.out.println("번호를 다시 입력해주세요.");
		a = scan.nextInt();
	}
}
}
