
public class Test_excute {
	public static void main(String[] args) {
		Test[] sArr = new Test[5];
//		test.name = "tset";
//		
//		System.out.println(test);

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = new Test((i+ 1) + "¹ø ÇÐ»ý");
			sArr[i].inputS();
		}

		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].toString());
		}
	}
}
