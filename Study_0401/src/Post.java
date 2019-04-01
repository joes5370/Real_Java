import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Post {
	String title;
	String dscription;
	String createDate;

	public void insertPost() {
		Scanner scan = new Scanner(System.in);

		System.out.println("제목: ");
		this.title = scan.nextLine();
		System.out.println("내용: ");
		this.dscription = scan.nextLine();

		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.createDate = dayTime.format(new Date(time));
	}
}
