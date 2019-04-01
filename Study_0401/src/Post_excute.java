
public class Post_excute {
	public static void main(String[] args) {
		Post post = new Post();
		post.insertPost();

		System.out.println("" + post.title + ", " + post.dscription + ", " + post.createDate);

	}
}
