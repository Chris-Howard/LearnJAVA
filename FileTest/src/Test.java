import java.io.*;
public class Test {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:\\Program Files (x86)\\Microsoft SQL Server\\DReplayClient\\WorkingDir\\");
		if(f.isDirectory()){
			System.out.println("�ļ����Ѵ���");
			File lists[] =f.listFiles();
			for (int i = 0;i<lists.length;i++){
				System.out.println("�ļ����ǣ�"+lists[i].getName());
			}
		}
		else {
			f.mkdir();
			System.out.println("�ļ��д����ɹ�");
		}
		File g = new File(f.getAbsolutePath()+"/textG.txt");
		if(g.exists()){
			System.out.println("�Ѵ���ͬ���ļ�");
		}
		else{
			try {
				g.createNewFile();
				System.out.println("textG.txt�����ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
