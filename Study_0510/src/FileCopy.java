import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\zzz\\aaa.jpg");
			out = new FileOutputStream("copy.jpg");
			
			while(true) {
				int data = in.read();
				if(data == -1) {
					break;
				}
				out.write(data);
			} // end while
			
		} catch(Exception e) {
			e.printStackTrace();
			//오류 그래도 출력해라
			
		} 
		
		finally {
			if(in != null) {
				try { in.close();} catch(Exception e) {}
			}
			if(out != null) {
				try { out.close();} catch(Exception e) {}
		}
	} // end finally 
}//end main
}

