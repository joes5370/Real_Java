package study_0329;

import java.util.Scanner;

public class Kaup_withpro {
	public double weight;
	public double height;

	public void process() {
		this.inputData();
		this.result();
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("ü��(���� kg) :");
		this.weight = scanner.nextDouble();
//	 System.out.println("ü��(���� kg) :");
//	 int weight = scanner.nextInt();
//	 double weightkg = (double)weight / 1000;

		System.out.println("����(����m) :");
		this.height = scanner.nextDouble();
	}

	public void result() {
		double koupResult = (double)this.weight / (this.height * this.height);
//		System.out.println("����� : " + koupResult);
		
		if(koupResult >=30) {
			System.out.println("��");
		}else if(koupResult >=24 && koupResult<=29) {
			System.out.println("��ü��");
		}else if(koupResult >=20 && koupResult < 24) {
			System.out.println("����");
		}else if(koupResult < 20) {
			System.out.println("��ü��");
		}else if(koupResult >=13 && koupResult <= 15) {
			System.out.println("����");
		}else if(koupResult >10 &&koupResult < 13) {
			System.out.println("���� ������");
		}else {
			System.out.println("���ϴ� �Ҹ���");
		}
	}
}
