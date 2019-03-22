import java.util.Arrays;

public class Arrangement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
//		} 배열의 수 뽑기
		System.out.println();
		
		int[] arr2 =arr;
		int[] arr3 = arr2;
		
		arr3[0] = 10;
		System.out.println(Arrays.toString(arr));
		
		
		
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
		System.out.print(" ");
		}
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr3[2]);
	

}
}