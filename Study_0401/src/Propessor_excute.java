
public class Propessor_excute {
	public static void main(String[] args) {
		Data_propessor[] sArr = new Data_propessor[5];

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = new Data_propessor();
			sArr[i].inputScore();
		}

	
		for (int i = 0; i < sArr.length; i++) {
			Data_propessor.korTotal = Data_propessor.korTotal + sArr[i].korS;
			Data_propessor.engTotal = Data_propessor.engTotal + sArr[i].engS;
			Data_propessor.mathTotal = Data_propessor.mathTotal + sArr[i].mathS;
		}
		System.out.println("±¹¾î ÃÑÁ¡Àº : " + Data_propessor.korTotal);
		System.out.println("¿µ¾î ÃÑÁ¡Àº : " + Data_propessor.engTotal);
		System.out.println("¼öÇÐ ÃÑÁ¡Àº : " + Data_propessor.mathTotal);

		System.out.println("±¹¾î Æò±ÕÀº : " + ((double) Data_propessor.korTotal / sArr.length));
		System.out.println("¿µ¾î Æò±ÕÀº : " + ((double) Data_propessor.engTotal / sArr.length));
		System.out.println("¼öÇÐ Æò±ÕÀº : " + ((double) Data_propessor.mathTotal / sArr.length));
	}
}
