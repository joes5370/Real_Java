
public class Score_p {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int rank;

	public String print() {
		return this.name +" ����: " + this.total + " ���� : "+ this.kor + " ���� : "+ this.eng + " ����: "+ this.math+" "+(this.rank+1)+"��";
	}
}
