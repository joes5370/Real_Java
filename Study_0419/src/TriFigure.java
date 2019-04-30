import java.util.Scanner;

public class TriFigure implements Figure{
	public String tmp;
	public double triHight;
	public double triBaseside;
	public double triAreaValue;
	Scanner scan = new Scanner(System.in);
	@Override
	public void inputValue() {
		 System.out.println("�ﰢ���� ���̸� �Է����ּ���.");
		 tmp = scan.nextLine();
		 try {
			 this.triHight =Double.parseDouble(tmp);
		 } catch (Exception e) {
			 this.triHight = 0;
		 }
		 System.out.println("�ﰢ���� �غ� �Է�.");
		 tmp= scan.nextLine();
		 try {
			 this.triBaseside =Double.parseDouble(tmp);
		 } catch (Exception e) {
			 this.triBaseside = 0;
		 }
		 this.triAreaValue = (this.triBaseside * this.triHight)/2;
		
	}

	@Override
	public void printResult() {
		 System.out.println("�ﰢ���� ���̴� "+this.triAreaValue+" �Դϴ�.");
		
	}

}
