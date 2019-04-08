
public class Extend extends Test {
	public void printResult() {
		super.printResult(); //부모 클래스가 가지고 있었던 printResult를 실행해
		//this는 내꺼 super는 상속(extends)가 이루어졌을 때 사용하는 것
		System.out.println("더하기 결과: "+(this.number1+this.number2));
		System.out.println("빼기 결과: " + (this.number1-this.number2));
		System.out.println("곱하기 결과: "+(this.number1*this.number2));
		System.out.println("나누기 결과: "+((double)this.number1 / this.number2));
	}
	public void newMethod() {
		
	}
}