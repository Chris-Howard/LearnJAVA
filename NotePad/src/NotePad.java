
/**
 * 时间：2017.0301星期三 功能：记事本，实现文本的打开编辑和保存
 */
// 导入所需包
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class NotePad extends JFrame implements ActionListener
{
	// 定义组件
	JMenuBar jmb = null;
	JMenu jm = null;
	JMenuItem jmiopen = null;
	JMenuItem jmiAnosave = null;
	JMenuItem jmiSave = null;
	JTextArea jta = null;
	// 增加设置字体功能

	// 打开的文件路径
	String fileName = null;

	// 输入输出流
	FileReader fr = null;
	BufferedReader bf = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	// //用于获取选择的文件绝对路径
	// String filename = null;

	public static void main(String[] args)
	{
		NotePad np = new NotePad();
	}

	public NotePad()
	{
		// 创建组件
		jta = new JTextArea();
		jmb = new JMenuBar();
		jm = new JMenu("菜单");

		ImageIcon ii = new ImageIcon("images/icon.jpg");
		jmiopen = new JMenuItem("打开", ii);
		jmiAnosave = new JMenuItem("另存为", ii);
		jmiSave = new JMenuItem("保存", ii);

		// 组装组件
		this.add(jta);
		jmb.add(jm);
		jm.add(jmiopen);
		jm.add(jmiAnosave);
		jm.add(jmiSave);
		this.setJMenuBar(jmb);

		// 设置菜单助记符
		jm.setMnemonic('F');

		// 设置监听
		jmiopen.addActionListener(this);
		jmiopen.setActionCommand("open");

		jmiSave.addActionListener(this);
		jmiSave.setActionCommand("save");

		jmiAnosave.addActionListener(this);
		jmiAnosave.setActionCommand("Anothersave");
		// 设置字体大小
		Font f = new Font("宋体", Font.PLAIN, 18);
		jta.setFont(f);

		// 设置窗口属性
		this.setTitle("记事本");
		this.setSize(600, 500);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("open"))
		{
			openfi();
		}
		else if (e.getActionCommand().equals("Anothersave"))
		{
			anoSavefi();
		}
		else if (e.getActionCommand().equals("save"))
		{
			if (fileName != null)
			{
				saveFi();
			}
			else
			{
				anoSavefi();
			}

		}

	}

	private void saveFi()
	{
		System.out.println("文件路径是" + fileName);
		try
		{
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			String str = jta.getText();
			bw.write(str);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			System.out.println("保存成功");
			try
			{
				bw.close();
				fw.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 保存文件
	private void anoSavefi()
	{
		// 文件选择组件
		JFileChooser jfc = new JFileChooser();
		// 设置Title
		jfc.setDialogTitle("请选择路径");
		// 默认方式
		jfc.showSaveDialog(null);
		// 设置窗口可见
		jfc.setVisible(true);
		if (jfc.getSelectedFile() != null)
		{
			// 得到选择的文件绝对路径
			String filename = jfc.getSelectedFile().getAbsolutePath();
			try
			{
				fw = new FileWriter(filename);
				bw = new BufferedWriter(fw);
				String str = jta.getText();
				bw.write(str);
			}
			catch (Exception e)
			{
				// TODO: handle exception
			}
			finally
			{
				try
				{
					bw.close();
					fw.close();
				}
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// 打开文件
	private void openfi()
	{
		// 文件选择组件
		JFileChooser jfc = new JFileChooser();
		// 设置Title
		jfc.setDialogTitle("请选择文件。。。");
		// 默认方式
		jfc.showOpenDialog(null);
		// 设置窗口可见
		jfc.setVisible(true);

		if (jfc.getSelectedFile() != null)
		{
			// 得到选择的文件绝对路径
			String filename = jfc.getSelectedFile().getAbsolutePath();
			fileName = filename;
			try
			{
				fr = new FileReader(filename);
				bf = new BufferedReader(fr);
				String str = "";
				String allstr = "";
				try
				{
					while ((str = bf.readLine()) != null)
					{
						allstr = allstr + str + "\r\n";
					}
					jta.setText(allstr);
				}
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("e1异常");
				}
			}
			catch (FileNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("e2异常");
			}
			finally
			{
				try
				{
					fr.close();
					bf.close();
				}
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("e3异常");
				}
			}
		}
	}
}
