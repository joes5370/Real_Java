import java.util.Arrays;
import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
		Random rand = new Random();

		Score[] student = new Score[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Score();
			// ������ ��ü�� �����ؼ� �迭�� �ִ´�.
		}
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "���л�";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
			// �� ��ü �����Ϳ� ������ �̸��� ����,����,���������� �ִ´�
		}
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
			// �� ��ü �����Ϳ� ������ ������ �ִ´�.
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
