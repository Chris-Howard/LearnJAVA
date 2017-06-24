import java.io.*;
public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br =null;
		FileWriter fw = null;
		BufferedWriter bw =null;
		try {
			fr = new FileReader("F:\\testFile\\testG.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("F:\\testFile\\testW.txt");
			bw = new BufferedWriter(fw);
			String s ="";
			while((s=br.readLine())!=null){
				bw.write(s+"\r\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
