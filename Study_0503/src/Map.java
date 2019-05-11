import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "BBBB");
		map.put("score", "100");
		System.out.println(map);
		
		for (Entry<String, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}

//		HashMap<String, Student> map = new HashMap<String, Student>();
//		map.put("name", new Student("name"));
//		System.out.println(map);
	}

}
