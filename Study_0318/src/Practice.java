import java.util.Random;

public class Practice {
	public static void main(String[] args) {
	 
		int r = 0;
		
		Random rand = new Random();
		System.out.println("�ֻ����� �����ּ���");
		r = rand.nextInt(6)+1;
	    System.out.println(r);
	    
	    if (r == 1) {
			System.out.println("�۸�");
		}else if (r == 2) {
			System.out.println("�߿�");
		}else if (r == 3) {
			System.out.println("3");
		}else if (r == 4) {
			System.out.println("4");
		}else if (r == 5) {
			System.out.println("5");
	    }else if (r == 6) {
	    	System.out.println("6");
		}
	    
	    
	}
}
