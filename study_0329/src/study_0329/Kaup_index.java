package study_0329;

import java.util.Scanner;

public class Kaup_index {
	private int kaup;
	public int hight2;
	public int weightkg;
	public void inp(int weight,int hight) {
		hight2 = hight * hight;
		weightkg = weight*10000;
		
		this.kaup = weightkg / hight2;
		
				
		if(this.kaup >=30) {
			System.out.println("비만");
		}else if(this.kaup >=24 && this.kaup<=29) {
			System.out.println("과체중");
		}else if(this.kaup >=20 && this.kaup < 24) {
			System.out.println("정상");
		}else if(this.kaup < 20 && this.kaup > 15) {
			System.out.println("저체중");
		}else if(this.kaup >=13 && this.kaup <= 15) {
			System.out.println("여윔");
		}else if(this.kaup >10 && this.kaup < 13) {
			System.out.println("영양 실조증");
		}else {
			System.out.println("이하는 소모증");
		}
	}
	
	

	}

