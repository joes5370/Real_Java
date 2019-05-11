import java.util.ArrayList;

public class RunStudent {
	public static void main(String[] args) {

		String[] names = { "철수", "에이스", "상디", "루피", "사스케", "나루토", "크룡", "뽀로로", "둘리", "영희" };
		// List생성
		ArrayList<Student> student = new ArrayList<Student>();

		for (int i = 0; i < names.length; i++) {
			// List에 넣어주기 위해 객체를 생성해서 add형태로 넣어준다.
			student.add(new Student(names[i]));

		}
		// list를 배열로 바꾸기
		Student[] arr = new Student[student.size()];
		student.toArray(arr);
		System.out.println(arr); // 주소 잡힘(배열)
		System.out.println(arr[0]);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].middleTest < arr[i].finalTest) {
				System.out.println(arr[i]);
			}
		}
		
		

	}
}
