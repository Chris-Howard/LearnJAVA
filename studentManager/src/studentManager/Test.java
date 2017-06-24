package studentManager;

import java.util.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Test extends JFrame implements ActionListener
{
	// �������
	JTextField jtf = null;
	JTable jt = null;
	JButton jb1, jb2, jb3, jb4;
	Vector rowData, columnNames;
	JScrollPane jsp = null;
	PreparedStatement ps = null;
	Connection ct = null;
	ResultSet rs = null;
	JTextPane jtp;
	JLabel jl;
	
	JPanel jp1, jp2;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test tt = new Test();
	}
	
	public Test()
	{
		columnNames = new Vector();
		columnNames.add("ѧ��");
		columnNames.add("����");
		columnNames.add("�Ա�");
		columnNames.add("��������");
		columnNames.add("�ǹ�����");
		// columnNames.add("sal");
		// columnNames.add("comm");
		// columnNames.add("deptno");
		
		rowData = new Vector();
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			ct = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			ps = ct.prepareStatement("select * from stu");
			rs = ps.executeQuery();
			
			while (rs.next())
			{
				Vector hang = new Vector();
				hang.add(rs.getInt(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(rs.getString(4));
				hang.add(rs.getInt(5));
				
				// hang.add(rs.getString(5));
				// hang.add(rs.getInt(6));
				// hang.add(rs.getInt(7));
				
				rowData.add(hang);
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			try
			{
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (ct != null)
					ct.close();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO: handle finally clause
		}
		
		jt = new JTable(rowData, columnNames);
		jsp = new JScrollPane(jt);
		
		jb1 = new JButton("��ѯ");
		jb2 = new JButton("ɾ��");
		jb3 = new JButton("�޸�");
		jb4 = new JButton("����");
		jp1 = new JPanel();
		jl = new JLabel("����");
		
		jp1.add(jl);
		jtf = new JTextField(20);
		jp1.add(jtf);
		jp1.add(jb1);
		
		jp2 = new JPanel();
		
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		
		this.add(jp1, BorderLayout.NORTH);
		this.add(jsp);
		this.add(jp2, BorderLayout.SOUTH);
		
		// ���ü���
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		
		this.setTitle("ѧ������ϵͳ");
		this.setSize(400, 250);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getSource() == jb1)
		{
		
		}
		if (e.getSource() == jb2)
		{
		
		}
		if (e.getSource() == jb3)
		{
		
		}
		if (e.getSource() == jb4)
		{
		}
	}
	
}
