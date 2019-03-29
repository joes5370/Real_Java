package study_0329;

public class Money_Box {
	public int totalCoin = 0; // 내가 가지고 있는 돈(속성값)
	public String name; // 저금통 이름넣기 ,public일시 상관없이 직접적으로 가능
//	private String name; private는 무조건 내부에서 매소드를 통해서만 변경가능

	public void setName(String inputName) {
		name = inputName; // 이름 지정 메소드 작성
	}
	
//	public void setName(String name) {
//		this.name = name;     내것에 있는 매소드 접근은 this (변수사용)
//	}

	public void deposit(int inputCoin) { // 돈이 들어오는 값 설정
		totalCoin = totalCoin + inputCoin; // 내가 가지고 있는 금액 +들어온 금액
//		this.totalCoin = this.totalCoin+inputCoin 도 가능

	}

	public void withdraw() {
		System.out.println("출금액: " + totalCoin);
		totalCoin = 0;
	}
}