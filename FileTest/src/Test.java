import java.io.*;
public class Test {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:\\Program Files (x86)\\Microsoft SQL Server\\DReplayClient\\WorkingDir\\");
		if(f.isDirectory()){
			System.out.println("文件夹已存在");
			File lists[] =f.listFiles();
			for (int i = 0;i<lists.length;i++){
				System.out.println("文件名是："+lists[i].getName());
			}
		}
		else {
			f.mkdir();
			System.out.println("文件夹创建成功");
		}
		File g = new File(f.getAbsolutePath()+"/textG.txt");
		if(g.exists()){
			System.out.println("已存在同名文件");
		}
		else{
			try {
				g.createNewFile();
				System.out.println("textG.txt创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
