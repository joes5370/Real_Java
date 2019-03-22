
public class Fuxi {
	public static void main(String[] args) {
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		for (int i = 0; i < 100; i++) {
			int number = i+1;
			total = total + number;
			
			if(number % 2 == 0 ) {
				evenTotal = evenTotal + number;
			}else {
				oddTotal = oddTotal + number;
			}
			
		}
		System.out.println("ÃÑÇÕÀº"+total);
		System.out.println("È¦¼öÇÕÀº"+oddTotal);
		System.out.println("Â¦¼öÇÕÀº"+evenTotal);
	}
}
