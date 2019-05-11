import java.util.ArrayList;

public class Practice {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		String[] names = { "철수", "에이스", "상디", "루피", "사스케", "나루토", "크룡", "뽀로로", "둘리", "영희" };
		for(int i =0; i < names.length; i++) {
			student.add(new Student(names[i]));
		}
		
		Student[] arr = new Student[student.size()];
		student.toArray(arr);
		System.out.println(arr[0]);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].middleTest < arr[i].finalTest) {
				System.out.println(arr[i]);
			}
		}
	}
}
