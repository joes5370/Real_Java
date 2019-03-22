import java.util.Scanner;

public class Compare {
public static void main(String[] args) {
	String a = "hello";
	String b = "hello";
	Scanner scan = new Scanner(System.in);
	String c = scan.nextLine();
	
	
	System.out.println(c == b);
	System.out.println(a.equals(c));
//	false로 떨어지는 이유는 주소가 다르기 때문에
	
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());

}
}
