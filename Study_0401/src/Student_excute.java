import java.util.Scanner;

public class Student_excute {
	public static void main(String[] args) {
//	Student s1 = new Student();
//	s1.name = "ȫ�浿";
//	s1.korScore = 100;
//	s1.engScore = 30;
//	s1.mathScore = 20;
//	s1.memo = "�Ż翡 ������";

		Student[] sArray = new Student[10];
//	�׳� �迭�� �������
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student();
//		��ü�����ϴ� ���·� ������ִ°�
			System.out.print("" + (i + 1) + "��° �л� ������ �Է�");
			System.out.println("�̸�: ");
			sArray[i].name = scan.nextLine();
			
			System.out.println("���� ����: ");
			String korString = scan.nextLine(); // "100"
			sArray[i].korScore = Integer.parseInt(korString); // 100
//			���ڿ��� ���ڷ� �ٲ���
			
			System.out.println("���� ����: ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
//			���ڿ��� ���ڷ� �ٲ���
			
			System.out.println("���� ����: ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
//			���ڿ��� ���ڷ� �ٲ���
			
			System.out.println("�޸� �Է����ּ��� : ");
			sArray[i].memo = scan.nextLine();
			scan.nextLine();
			
			
		}
	}
}
