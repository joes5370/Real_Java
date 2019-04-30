import java.util.ArrayList;

public class MakeArray {
	public static void main(String[] args) {
		String[] names = { "철수", "에이스", "상디", "루피", "사스케", "나루토", "크룡", "뽀로로", "둘리", "영희" };
		// List생성
		ArrayList<Student> student = new ArrayList<Student>();

		for (int i = 0; i < names.length; i++) {
			// List에 넣어주기 위해 객체를 생성해서 add형태로 넣어준다.
			student.add(new Student(names[i]));

		}
		
		//다음시간 4.29 - 5.3일날 캐스팅 하는 매소드 만들기 
		Student[] arr = (Student[]) student.toArray();
		
		for(int i =0; i <arr.length; i++) {
			if(arr[i].middleTest < arr[i].finalTest) {
				System.out.println(arr[i]);
			}
		}
	}
}
