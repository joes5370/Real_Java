import java.util.Arrays;
import java.util.Scanner;

public class Arrangement_issue {
	private void mian() {
		
		Scanner s = new Scanner(System.in);
		int[] grades = new int[10];
		
		for(int i = 0; i < grades.length; i++) {
			System.out.print(i + "���� ������ �־��ּ���.");
			int userInput = s.nextInt();
			grades[i] = userInput;
		}
		
		System.out.println("ó���� �������� ������ �����ϴ�.");
		System.out.println(Arrays.toString(grades));
	}
}
