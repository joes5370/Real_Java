import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		System.out.println(list);
		list.set(1, "EEEE"); // list1의 값을 EEEE로 바꿔라
		System.out.println(list);

		String temp = list.get(2);

		// 리스트에서 정수로 받기
		ArrayList<Integer> listNumber = new ArrayList<Integer>();
		listNumber.add(2);
		listNumber.add(5);
		listNumber.add(10);
		listNumber.add(3);
		listNumber.add(1);
		System.out.println(listNumber);

		// length가 아니라 size로 작성한다. 순차적으로 작성
		for (int i = 0; i < listNumber.size(); i++) {
			System.out.print(listNumber.get(i) + ", ");
		}
		
		
		
		
		


	}
}
