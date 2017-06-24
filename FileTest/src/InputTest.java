import java.io.*;
public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		try {
			fis = new FileInputStream
					("C:\\Users\\Howard\\Pictures\\QQ\\QQ.jpg");
			fos = new FileOutputStream
					("F:\\testFile\\QQ.jpg");
			int n = 0;
			byte buf[] = new byte[512];

				try {
					while((n=fis.read(buf))!=-1){
						fos.write(buf);}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
}
