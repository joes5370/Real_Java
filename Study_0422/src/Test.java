import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		StringBuffer b = new StringBuffer("Hello");
		b.append(" world");
		System.out.println(b);
		
		System.out.println(System.currentTimeMillis());
		// 천분의 1초 단위로 보여준다.
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		double randNum = Math.random();
		System.out.println(randNum);
		double choice = Math.floor(randNum *5);
		//0부터 4까지 랜덤한 값을 발생
		System.out.println(choice);
		
		Integer q = Integer.valueOf(10);
		int w = q;
		System.out.println(w);
		
		java.util.Random rand = new java.util.Random();
		//같은 이름의 클래스가 두개이상 있을 때 섞어 쓰기 위해
		//너무 많은 import가 보기 싫을 때
		
		try {
			//여기서 코드를 작성한다.
			//try안에 있는 코드들 중에 하나라도 에러가 나면 catch로 빠진다.
			//그 중에 여러개가 에러가 나면 그에 상응하는 catch문을 여러개로 써준다.
			//프로그램이 뻑이 나면 안되기 때문에 사람들이 대응할 어떤 것을 줘야한다.
		} catch (Exception e) {
			// try에 에러난 부분에 대한 예외 처리이다.
			// Exception에 모든 형태의 예외들이 잡혀서 들어온다.
		}
		
	}
}
