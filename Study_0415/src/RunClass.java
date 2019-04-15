import java.util.Arrays;
import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
		Random rand = new Random();

		Score[] student = new Score[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Score();
			// 각각의 객체를 생성해서 배열에 넣는다.
		}
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번학생";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
			// 각 객체 데이터에 접근해 이름과 국어,영어,수학점수를 넣는다
		}
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
			// 각 객체 데이터에 접근해 총점을 넣는다.
		}

		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if (student[i].total < student[j].total) {
					Score tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
//		System.out.println(Arrays.toString(student));

	}
}
