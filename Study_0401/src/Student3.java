
public class Student3 {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
	// 생성자 초기값넣을때 꼭 안넣어도 되지만, 훨씬 직관적이다. 
	// 객체를 만들때, 초기동작(값)을 지정할 수 있다.
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
