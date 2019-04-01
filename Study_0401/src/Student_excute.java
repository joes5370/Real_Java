import java.util.Scanner;

public class Student_excute {
	public static void main(String[] args) {
//	Student s1 = new Student();
//	s1.name = "홍길동";
//	s1.korScore = 100;
//	s1.engScore = 30;
//	s1.mathScore = 20;
//	s1.memo = "매사에 진취적";

		Student[] sArray = new Student[10];
//	그냥 배열만 만들어줌
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student();
//		객체생성하는 형태로 만들어주는것
			System.out.print("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.println("이름: ");
			sArray[i].name = scan.nextLine();
			
			System.out.println("국어 점수: ");
			String korString = scan.nextLine(); // "100"
			sArray[i].korScore = Integer.parseInt(korString); // 100
//			문자열을 숫자로 바꿔줌
			
			System.out.println("영어 점수: ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
//			문자열을 숫자로 바꿔줌
			
			System.out.println("수학 점수: ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
//			문자열을 숫자로 바꿔줌
			
			System.out.println("메모를 입력해주세요 : ");
			sArray[i].memo = scan.nextLine();
			scan.nextLine();
			
			
		}
	}
}
