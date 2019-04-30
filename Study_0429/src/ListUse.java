import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListUse {
	public static void main(String[] args) {
		String[] names = { "철수", "에이스", "상디", "루피", "사스케", "나루토", "크룡", "뽀로로", "둘리", "영희" };
		// List생성
		ArrayList<Student> student = new ArrayList<Student>();

		for (int i = 0; i < names.length; i++) {
			// List에 넣어주기 위해 객체를 생성해서 add형태로 넣어준다.
			student.add(new Student(names[i]));

		}
		// List뽑기
		System.out.println(student.get(1));

		// 매소드를 추가해서 사용한다.
		student.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				if(t.middleTest < t.finalTest) {
					System.out.println(t);
				}
			}
		});

	}
}
