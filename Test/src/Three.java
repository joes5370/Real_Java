import java.util.Random;

public class Three {
	public static void main(String[] args) {
		Three_Student[] three = new Three_Student[100];
		
		System.out.println("중간고사와 기말고사 비교시 성적향상 평가");
		for(int i = 0; i < three.length; i++) {
			three[i] = new Three_Student((i+1)+"번째 학생");
			three[i].input();
			
			if(three[i].middleTest < three[i].finalTest) {
				System.out.println("성정이 향상된 학생: " +three[i].name+ " ("+"중간고사 점수: "+three[i].middleTest+","+ "기말고사 점수: " +three[i].finalTest+")");
			}
		}
		
		
		
		
		
	}
}
