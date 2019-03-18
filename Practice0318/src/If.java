import java.util.Random;
import java.util.Scanner;

public class If {
public static void main(String[] args) {
	int a = 0;
	int b = 0; 
	int c = 0;
	
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("a의점수를 입력해주세요");
	a = scan.nextInt();
	b = r.nextInt(101);
	System.out.println("랜덤생성된 점수는:"+b);
	System.out.println("c의점수를 입력해주세요");
	c = scan.nextInt();
	

	if (a > b && a > c && b > c) {
		System.out.println("1등 : a "+"2등:b "+"3등 : c" );
	}else if (a > b && a > c && c > b) {
		System.out.println("1등 : a "+"2등 :b "+"3등 : c");
	}else if (b > a && b > c && a > c) {
		System.out.println("1등 : b "+"2등 :a "+"3등 : c");
	}else if (b > a && b > c && c > a) {
		System.out.println("1등 : b "+"2등 :c "+"3등 : a");
	}else if (c > a && c > b && a > b) {
		System.out.println("1등 : c "+"2등 :a "+"3등 : b");
	}else if (c > a && c > b && b > a) {
		System.out.println("1등 : c "+"2등 :b "+"3등 : a");
	}else {
		System.out.println("포기");
	}
	
}
}
