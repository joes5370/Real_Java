
public class Extend extends Test {
	public void printResult() {
		super.printResult(); //�θ� Ŭ������ ������ �־��� printResult�� ������
		//this�� ���� super�� ���(extends)�� �̷������ �� ����ϴ� ��
		System.out.println("���ϱ� ���: "+(this.number1+this.number2));
		System.out.println("���� ���: " + (this.number1-this.number2));
		System.out.println("���ϱ� ���: "+(this.number1*this.number2));
		System.out.println("������ ���: "+((double)this.number1 / this.number2));
	}
	public void newMethod() {
		
	}
}