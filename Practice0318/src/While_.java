
public class While_ {
	public static void main(String[] args) {
		int a = 0;
		while(true) {
			if(a>5) {
				break;
			}
			System.out.print(a);
			a++;
//			while에선 항상 break;를 작성해야함
//			continue는 특정 조건에 만족했을때, 반복문을 처음으로 돌린다.
		}
		
	}
}


