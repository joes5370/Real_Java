
public class Student3 {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
	// ������ �ʱⰪ������ �� �ȳ־ ������, �ξ� �������̴�. 
	// ��ü�� ���鶧, �ʱ⵿��(��)�� ������ �� �ִ�.
	Student3(String name) {
		this.name = name;
		
	}
	
	Student3(String name, int korScore,int engScore,int mathScore){
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
}
}
