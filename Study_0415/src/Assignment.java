import java.util.Random;

public class Assignment extends Random {
	public int newMethod(int range) {
		int newRandomNumber = super.nextInt(range)+100;
		return newRandomNumber;
		
	}
}








//public class Assignment extends Random {
//	@Override
//	public int newxtInt(int range) {
//		int newRandomNumber = super.nextInt(range)+100;
//		return newRandomNumber;
//		
//	}
//}
