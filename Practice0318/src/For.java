
import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
//          총 4번을 반복한다.
//			i = 10; 변경시키지 말자.
//			만약 변경시키고 싶다면
//			int test = i;
//			test = 10
//			즉 i값을 변수에 지정한 후 변수 자체를 변경하자!
			System.out.println(i);
//		         가운데 i는 반복에 대한 개념을 알고있자!

			for (int j = 0; j < 4; j++) {
				System.out.print(j);
			}
		}

	}

}
