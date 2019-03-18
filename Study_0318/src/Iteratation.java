
public class Iteratation {
public static void main(String[] args) {
	int a = 0;
	int evenSum = 0;
	
	for (int i = 1; i <= 100; i++) {
		a = a+i;
		if (i%2==0) {
			evenSum = i+evenSum;
		}
	}System.out.println("Â¦¼öÀÇÇÕ : "+evenSum+" " + "È¦¼öÀÇ °ª:" + (a - evenSum));
}
}
