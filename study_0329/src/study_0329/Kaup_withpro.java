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

		System.out.println("체중(단위 kg) :");
		this.weight = scanner.nextDouble();
//	 System.out.println("체중(단위 kg) :");
//	 int weight = scanner.nextInt();
//	 double weightkg = (double)weight / 1000;

		System.out.println("신장(단위m) :");
		this.height = scanner.nextDouble();
	}

	public void result() {
		double koupResult = (double)this.weight / (this.height * this.height);
//		System.out.println("계산결과 : " + koupResult);
		
		if(koupResult >=30) {
			System.out.println("비만");
		}else if(koupResult >=24 && koupResult<=29) {
			System.out.println("과체중");
		}else if(koupResult >=20 && koupResult < 24) {
			System.out.println("정상");
		}else if(koupResult < 20) {
			System.out.println("저체중");
		}else if(koupResult >=13 && koupResult <= 15) {
			System.out.println("여윔");
		}else if(koupResult >10 &&koupResult < 13) {
			System.out.println("영양 실조증");
		}else {
			System.out.println("이하는 소모증");
		}
	}
}
