import java.util.Random;

public class Student {
	String name;
	int middleTest = 0;
	int finalTest = 0;
	int mtotal = 0;
	int ftotal = 0;
	
	Student(String name){
		this.name = name;
		Random rand = new Random();
		this.middleTest = rand.nextInt(1001);
		this.finalTest = rand.nextInt(1001);
	}
	@Override
	public String toString() {
		return this.name + "(중간:"+this.middleTest+", 기말 : "+this.finalTest+")";
		
	}
	

}
