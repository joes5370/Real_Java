
public class Score {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	

	public String print() {
		return this.name + " ����: " + this.total + "(����" + this.kor + ", ����" + this.eng + ",����" + this.math + ")";
	}

	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total);
		return tmp;
	}
}
//
//@Override
//public String toString() {
//	return this.name + " ����: " + this.total + "(����" + this.kor + ", ����" + this.eng + ",����" + this.math + ")";
//}