import java.util.Scanner;

public class Test {
	String name;
	int middleTest;
	int finalTest;
	
	Test(String name) {
		this.name = name;
	}

	public void inputS() {
		Scanner s1 = new Scanner(System.in);

		System.out.println(name + "점수입력");

		System.out.println("중간고사 성적을 입력해주세요: ");
		String middleTest = s1.nextLine();
		this.middleTest = Integer.parseInt(middleTest);

		System.out.println("기말고사 성적을 입력해 주세요: ");
		String finalTest = s1.nextLine();
		this.finalTest = Integer.parseInt(finalTest);
	}
	
	public String toString() {
		return this.name + " (중간고사" + this.middleTest + ",기말고사" + this.finalTest + ")";
	}


}
