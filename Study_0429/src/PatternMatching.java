import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
	public static void main(String[] args) {
		String test = "777788889";
		Pattern pat = Pattern.compile("(3|6|9)");
										//"[369]"도 가능 다만 글자 하나만
		Matcher match = pat.matcher(test);
		
		int matchCount = 0;
		for(int i = 0; i < test.length(); i++) {
			if(match.find()) {
				System.out.println(match.group());
				matchCount++;
			}else {
				break;
			}
		}
		System.out.println("총 매치 갯수 : "+matchCount);
	}
}
