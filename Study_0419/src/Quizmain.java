import java.util.Scanner;

public class Quizmain {
	public static void main(String[] args) {
		System.out.println("�������� ���ϱ�");
		System.out.println("���ϰ� ���� ������ ����.");
		System.out.println("1. �ﰢ��, 2. �簢��, 3. ��, 4. ��ٸ���, 5. ��n����");
		Scanner s = new Scanner(System.in);
		int select = s.nextInt();
		if (select == 1) {
			Figure geo1 = new TriFigure();
			geo1.inputValue();
			geo1.printResult();
		} else if (select == 2) {
			Figure geo2 = new figureOut1();
			geo2.inputValue();
		} else if (select == 3) {
			Figure geo3 = new FigureCircle();
			geo3.inputValue();
			geo3.printResult();
		} else if (select == 4) {	Figure geo4 = new TrapeZoid();
			geo4.inputValue();}
		else if (select == 5) {
			Figure geo5 = new figureOut2();
			geo5.inputValue();
		}
	}
}
