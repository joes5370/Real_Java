import java.util.HashMap;
import java.util.Map.Entry;

public class Map_Studetent {
	public static void main(String[] args) {
		
		HashMap<String, Student> map = new HashMap<String, Student>();

			
		for(int i =0; i<10; i++) {
			map.put((i+1)+"번째학생", new Student(""));
		}
		
		for(Entry<String, Student> item : map.entrySet()){
			Student one = item.getValue();
			String two = item.getKey();
			
			if(one.middleTest < one.finalTest) {
				System.out.print(two+" ");
				System.out.println(one);
			}
		}

		
	}
}
