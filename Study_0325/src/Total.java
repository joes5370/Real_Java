
public class Total {
	public void total() {
		int sum = 0;
		for(int i = 0; i <100; i++) {
			int number = i+1;
			sum = sum + number;
		}
		
		System.out.println("1부터 100까지 합은" + sum);
	}
}
