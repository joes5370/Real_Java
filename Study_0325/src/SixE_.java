
public class SixE_ {
	public static void main(String[] args) {
		SixE six = new SixE();
		System.out.println("6의배수는");

		for (int i = 0; i < 100; i++) {
			int checkNumber = i + 1;
			boolean result = six.dosix(checkNumber);
			if (result) {
				System.out.print("  " + checkNumber);
			}
		}

	}
}
