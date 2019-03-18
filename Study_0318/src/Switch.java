import java.util.Random;

public class Switch {
public static void main(String[] args) {
	
	 int r = 0 ;
	 
	 Random rand = new Random();
	 r = rand.nextInt(6)+1;
	 
	 System.out.println("ÁÖ»çÀ§¸¦ ±¼·ÁÁÖ¼¼¿ä");
	 System.out.println(r);
	
	 	 
	 switch (r) {
	case 1:
		System.out.println("¸Û¸Û");
		break;
	case 2:
		System.out.println("¾ß¿Ë");
		break;
	case 3:
		System.out.println("¾îÈï");
		break;
	case 4:
		System.out.println("»ß¾à");
		break;
	case 5:
		System.out.println("Å¯Å¯");
		break;
	case 6:
		System.out.println("ÄíÄí");
		break;
	default:
		break;
	}
	
	
}
}
