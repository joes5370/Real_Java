
public class SixE_ {
	public static void main(String[] args) {
		SixE six = new SixE();
		System.out.println("6�ǹ����");

		for (int i = 0; i < 100; i++) {
			int checkNumber = i + 1;
			boolean result = six.dosix(checkNumber);
			if (result) {
				System.out.print("  " + checkNumber);
			}
		}

	}
}
