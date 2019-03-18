
public class Assignment {
public static void main(String[] args) {
	
	int sum = 0;
	int totalsum = 0;
	
	for (int i = 1; i < 101; i++) {
		sum = sum+i;
		
		if (i%2 == 0) {
			totalsum = totalsum + i;
		}
		}
	
		System.out.println(totalsum);
		
		System.out.println("짝수합 :"+totalsum +"홀수합:"+(sum-totalsum));
			
		
}
}
