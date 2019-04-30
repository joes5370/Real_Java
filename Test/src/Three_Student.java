import java.util.Random;

public class Three_Student {
	String name;
	int middleTest;
	int finalTest;
	int mKors;
	int mEngs;
	int mMaths;

	int fKors;
	int fEngs;
	int fMaths;

	Three_Student(String name) {
		this.name = name;
	}

	public void input() {
		Random rand = new Random();
		for (int i = 0; i < name.length(); i++) {
			this.mKors = rand.nextInt(100);
			this.mEngs = rand.nextInt(100);
			this.mMaths = rand.nextInt(100);
			this.middleTest = this.mKors + this.mEngs + this.mMaths;

		}

		for (int i = 0; i < name.length(); i++) {
			this.fKors = rand.nextInt(100);
			this.fEngs = rand.nextInt(100);
			this.fMaths = rand.nextInt(100);
			this.finalTest = this.fKors + this.fEngs + this.fMaths;
		}
	}
	


}
