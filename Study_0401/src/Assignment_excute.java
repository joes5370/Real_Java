import java.util.Scanner;

public class Assignment_excute {
	public static void main(String[] args) {
		Data[] data = new Data[5];
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int Ktotal = 0;
		int Etotal = 0;
		int Mtotal = 0;
		double Avr = 0;
		double KAvr = 0;
		double EAvr = 0;
		double MAvr = 0;

		for (int i = 0; i < data.length; i++) {
			data[i] = new Data();

			System.out.println("�̸�: ");
			data[i].name = scan.nextLine();

			System.out.println("�����: ");
			String korS = scan.nextLine();
			data[i].korS = Integer.parseInt(korS);

			System.out.println("�����: ");
			String engS = scan.nextLine();
			data[i].engS = Integer.parseInt(engS);

			System.out.println("���м���: ");
			String mathS = scan.nextLine();
			data[i].mathS = Integer.parseInt(mathS);

			Ktotal = Ktotal + data[i].korS;
			Etotal = Etotal + data[i].engS;
			Mtotal = Mtotal + data[i].mathS;

			total = total + data[i].korS + data[i].engS + data[i].mathS;

		}

		Avr = (double) total / data.length;
		KAvr = (double) Ktotal / data.length;
		EAvr = (double) Etotal / data.length;
		MAvr = (double) Mtotal / data.length;
		System.out.println("�������� ��ü ����:" + Ktotal + "������ü���:" + KAvr);
		System.out.println("�������� ��ü ����:" + Etotal + "������ü���:" + EAvr);
		System.out.println("�������� ��ü ����:" + Mtotal + "������ü���:" + MAvr);
		System.out.println("��ü������:  " + total + "��ü�����: " + Avr);

	}
}
