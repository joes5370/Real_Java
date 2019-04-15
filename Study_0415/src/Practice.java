import java.util.Random;

public class Practice {
	public static void main(String[] args) {
		Random r = new Random();
		Score_p[] p = new Score_p[10];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Score_p();
		}
		
		for (int i = 0; i < p.length; i++) {
			p[i].name = (i + 1) + "¹ø ÇÐ»ý";
			p[i].kor = r.nextInt(101);
			p[i].eng = r.nextInt(101);
			p[i].math = r.nextInt(101);
			p[i].total = p[i].kor + p[i].eng + p[i].math;
		}
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++) {
				if (p[i].total > p[j].total) {
					p[j].rank = p[j].rank + 1;
				}
			}
		}

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].print());
		}

	}
}
