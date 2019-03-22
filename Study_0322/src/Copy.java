import java.util.Arrays;

public class Copy {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] temp = {1,2,0,0,0};
		
		System.arraycopy(arr, 3,temp, 2,2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}
}
