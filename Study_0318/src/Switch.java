import java.util.Random;

public class Switch {
public static void main(String[] args) {
	
	 int r = 0 ;
	 
	 Random rand = new Random();
	 r = rand.nextInt(6)+1;
	 
	 System.out.println("�ֻ����� �����ּ���");
	 System.out.println(r);
	
	 	 
	 switch (r) {
	case 1:
		System.out.println("�۸�");
		break;
	case 2:
		System.out.println("�߿�");
		break;
	case 3:
		System.out.println("����");
		break;
	case 4:
		System.out.println("�߾�");
		break;
	case 5:
		System.out.println("ůů");
		break;
	case 6:
		System.out.println("����");
		break;
	default:
		break;
	}
	
	
}
}
