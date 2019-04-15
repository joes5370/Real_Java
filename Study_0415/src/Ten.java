import java.util.Random;

public class Ten extends Random {
	int[] resultArr = new int[10];
	public void nextInt3(int range) {
		for(int i =0; i < resultArr.length; i++) {
			resultArr[i] = super.nextInt(range);
		}
	}
	
	
//	public int[] nextInt2(int range) {
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = super.nextInt(range);
//		}
//		return arr;
//	}

}
