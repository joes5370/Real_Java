import java.util.Scanner;

public class Compare {
public static void main(String[] args) {
	String a = "hello";
	String b = "hello";
	Scanner scan = new Scanner(System.in);
	String c = scan.nextLine();
	
	
	System.out.println(c == b);
	System.out.println(a.equals(c));
//	false�� �������� ������ �ּҰ� �ٸ��� ������
	
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());

}
}
