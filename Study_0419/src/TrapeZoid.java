import java.util.Scanner;

public class TrapeZoid implements Figure {
	double a = 0;
	double b = 0;
	double h = 0;
	double area = 0;
	@Override
	public void inputValue() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ���̸� �Է��ϼ���.");
		try {
			this.a = s.nextDouble();
		}catch(Exception e) {
			this.a = 1;
		}
		System.out.println("�غ��� ���̸� �Է��ϼ���");
		try {
			this.b = s.nextDouble();
		}catch(Exception e) {
			this.a = 1;
		}
		System.out.println("������ ����");
		try {
			this.h = s.nextDouble();
		}catch(Exception e) {
			this.a = 1;
		}
		this.area = (a+b) *h / 2;
		System.out.println(this.area);
	}

	@Override
	public void printResult() {
		System.out.println("��ٸ��� ����: "+ this.area);
		
	}

}
