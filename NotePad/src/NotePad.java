
/**
 * ʱ�䣺2017.0301������ ���ܣ����±���ʵ���ı��Ĵ򿪱༭�ͱ���
 */
// ���������
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class NotePad extends JFrame implements ActionListener
{
	// �������
	JMenuBar jmb = null;
	JMenu jm = null;
	JMenuItem jmiopen = null;
	JMenuItem jmiAnosave = null;
	JMenuItem jmiSave = null;
	JTextArea jta = null;
	// �����������幦��

	// �򿪵��ļ�·��
	String fileName = null;

	// ���������
	FileReader fr = null;
	BufferedReader bf = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	// //���ڻ�ȡѡ����ļ�����·��
	// String filename = null;

	public static void main(String[] args)
	{
		NotePad np = new NotePad();
	}

	public NotePad()
	{
		// �������
		jta = new JTextArea();
		jmb = new JMenuBar();
		jm = new JMenu("�˵�");

		ImageIcon ii = new ImageIcon("images/icon.jpg");
		jmiopen = new JMenuItem("��", ii);
		jmiAnosave = new JMenuItem("���Ϊ", ii);
		jmiSave = new JMenuItem("����", ii);

		// ��װ���
		this.add(jta);
		jmb.add(jm);
		jm.add(jmiopen);
		jm.add(jmiAnosave);
		jm.add(jmiSave);
		this.setJMenuBar(jmb);

		// ���ò˵����Ƿ�
		jm.setMnemonic('F');

		// ���ü���
		jmiopen.addActionListener(this);
		jmiopen.setActionCommand("open");

		jmiSave.addActionListener(this);
		jmiSave.setActionCommand("save");

		jmiAnosave.addActionListener(this);
		jmiAnosave.setActionCommand("Anothersave");
		// ���������С
		Font f = new Font("����", Font.PLAIN, 18);
		jta.setFont(f);

		// ���ô�������
		this.setTitle("���±�");
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
		System.out.println("�ļ�·����" + fileName);
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
			System.out.println("����ɹ�");
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

	// �����ļ�
	private void anoSavefi()
	{
		// �ļ�ѡ�����
		JFileChooser jfc = new JFileChooser();
		// ����Title
		jfc.setDialogTitle("��ѡ��·��");
		// Ĭ�Ϸ�ʽ
		jfc.showSaveDialog(null);
		// ���ô��ڿɼ�
		jfc.setVisible(true);
		if (jfc.getSelectedFile() != null)
		{
			// �õ�ѡ����ļ�����·��
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

	// ���ļ�
	private void openfi()
	{
		// �ļ�ѡ�����
		JFileChooser jfc = new JFileChooser();
		// ����Title
		jfc.setDialogTitle("��ѡ���ļ�������");
		// Ĭ�Ϸ�ʽ
		jfc.showOpenDialog(null);
		// ���ô��ڿɼ�
		jfc.setVisible(true);

		if (jfc.getSelectedFile() != null)
		{
			// �õ�ѡ����ļ�����·��
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
					System.out.println("e1�쳣");
				}
			}
			catch (FileNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("e2�쳣");
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
					System.out.println("e3�쳣");
				}
			}
		}
	}
}
