
public class SumMachine {
	public void makeSum(int startValue, int endValue) {
		int sum = 0;
// 변수를 안주고 해도 상관없다. 변수 쓰기 싫다면 입력값을 써줘야함
		
		for(int i = startValue; i <=endValue; i++) {
			sum = sum + i;
		}
		
		System.out.println("시작값: "+ startValue+"종료값: "+ endValue);
		System.out.println("총 합: "+ sum);
	}
	

}
