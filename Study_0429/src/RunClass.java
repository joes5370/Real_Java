import java.util.Arrays;
import java.util.List;

public class RunClass {
	public static void main(String[] args) {
		String[] names = { "철수", "에이스", "상디", "루피", "사스케", "나루토", "크룡", "뽀로로", "둘리", "영희" };
		Student[] student = new Student[names.length];

		for (int i = 0; i < names.length; i++) {
			student[i] = new Student(names[i]);
		}
		
		//배열을 List로 바꿀때
		List<Student> list = Arrays.asList(student);
		
		
		for (int i = 0; i < student.length; i++) {
			if (student[i].middleTest < student[i].finalTest) {
				System.out.println(student[i]);
			}
		}

	}
}
