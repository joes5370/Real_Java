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

		System.out.println(name + "�����Է�");

		System.out.println("�߰���� ������ �Է����ּ���: ");
		String middleTest = s1.nextLine();
		this.middleTest = Integer.parseInt(middleTest);

		System.out.println("�⸻��� ������ �Է��� �ּ���: ");
		String finalTest = s1.nextLine();
		this.finalTest = Integer.parseInt(finalTest);
	}
	
	public String toString() {
		return this.name + " (�߰����" + this.middleTest + ",�⸻���" + this.finalTest + ")";
	}


}
