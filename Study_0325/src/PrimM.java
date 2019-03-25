

public class PrimM {
	public void doM(int inputN) {
		if (inputN<1) {
			System.out.print("양수만 입력해 주세요.");
			return;

		}
		
		boolean isprimeN = true;
		for(int i = 2; i < inputN / 2+1; i++) {
			if(inputN % i ==0) {
				isprimeN = false;
				break;

			}
		}
		
				
		if(isprimeN) {
			System.out.println(""+inputN+"는소수입니다.");
		} 
		}
	}

