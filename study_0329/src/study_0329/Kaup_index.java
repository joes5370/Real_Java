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
			System.out.println("��");
		}else if(this.kaup >=24 && this.kaup<=29) {
			System.out.println("��ü��");
		}else if(this.kaup >=20 && this.kaup < 24) {
			System.out.println("����");
		}else if(this.kaup < 20 && this.kaup > 15) {
			System.out.println("��ü��");
		}else if(this.kaup >=13 && this.kaup <= 15) {
			System.out.println("����");
		}else if(this.kaup >10 && this.kaup < 13) {
			System.out.println("���� ������");
		}else {
			System.out.println("���ϴ� �Ҹ���");
		}
	}
	
	

	}

