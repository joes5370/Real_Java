import java.util.Arrays;
import java.util.Scanner;

public class Arrangement_withPropessor {
	public static void main(String[] args) {
		int[] korScore = new int[10];
//		int�� 10ĭ�� ���鲨��

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < korScore.length; i++) {
			System.out.print("��������: ");
			korScore[i] = scan.nextInt();
		}

		System.out.println(Arrays.toString(korScore));
//		Arrats.toString()�� �迭�� ���� ����ϱ� ���� ���ش�

		int total = 0;
		double avr = 0;

		for (int i = 0; i < korScore.length; i++) {
			total = total + korScore[i];
		}
		avr = (double) total / korScore.length;

		System.out.println("������ : " + total + "�����: " + avr);

	}
}
