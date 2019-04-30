
public class Four {
	public static void main(String[] args) {

		System.out.println("369게임을 시작합니다.");
		for (int i = 1; i <= 50; i++) {
			int temp = i / 10;
			int temp1 = i % 10;
			String answer = "";
			String name = "";
			boolean a = true;
			
			if(i%3 == 1) {
				name = "짱구";
			}else if(i%3 ==2){
				name = "철수";
			}else if(i%3 == 0) {
				name = "유리";
			}
			
			if (temp == 3 || temp == 6 || temp == 9) {
				answer = answer + "짝";
				a = false;
			}
			if (temp1 == 3 || temp1 == 6 || temp1 == 9) {
				answer = answer + "짝";
				a = false;
			}
			
			if(a == true) {
				System.out.println(name + " " +i);
			}else {
				System.out.println(name + " "+answer);
			}

		}
	}
}