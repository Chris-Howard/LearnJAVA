import java.awt.*;
import javax.swing.*;

/**
 * 功能：模仿QQ登录界面
 * 
 * 
 * 
 * */
public class qqLogin extends JFrame {
	//定义所需组件
	//北部
	JLabel nouthJl;
	
	//南部
	JPanel southJp;
	JButton login,cancel,regedit;
	//中部
	JTabbedPane jtp;
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2,jl3,jl4;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb;
	JCheckBox jcb1,jcb2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qqLogin qq=new qqLogin();
	}
	

	public qqLogin(){
		//北部
		nouthJl = new JLabel(new ImageIcon("images/QQlogo.jpg"));
		//nouthJl.setSize(400, 80);
		//南部
		southJp = new JPanel();
		southJp.setLayout(new FlowLayout());
		login = new JButton(new ImageIcon("images/login.jpg"));
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancel = new JButton(new ImageIcon("images/cancel.jpg"));
		cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		regedit = new JButton(new ImageIcon("images/regedit.jpg"));
		regedit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		southJp.setLayout(new GridLayout(1, 3, 10, 10));
		southJp.add(login);
		southJp.add(cancel);
		southJp.add(regedit);
		//中部
		jtp = new JTabbedPane();
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp2.setBackground(Color.RED);
		jp3 = new JPanel();
		jp3.setBackground(Color.blue);
		
		jl1 = new JLabel("QQ号码",JLabel.CENTER);
		jl2 = new JLabel("密码",JLabel.CENTER);
		jl3 = new JLabel("忘记密码",JLabel.CENTER);
		jl3.setFont(new Font("宋体", Font.PLAIN, 16));
		jl3.setForeground(Color.BLUE);
		jl4 = new JLabel("<html> <a href = 'www.baidu.com'>百度一下</a> </html>",JLabel.CENTER);
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		jtf = new JTextField(10);
		jpf = new JPasswordField();
		jb = new JButton(new ImageIcon("images/cleargif.jpg"));
		
		jcb1 = new JCheckBox("记住密码");
		jcb2 = new JCheckBox("隐身登录");
		
		jp1.setLayout(new GridLayout(3,3));
		jp1.add(jl1);
		jp1.add(jtf);
		jp1.add(jb);
		
		jp1.add(jl2);
		jp1.add(jpf);
		jp1.add(jl3);
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jl4);
		
		jtp.add("QQ号码",jp1);
		jtp.add("邮箱登录",jp2);
		jtp.add("手机登录",jp3);
		
		
		//
		//this.setLayout(new GridLayout(3,1));
		this.add(nouthJl,BorderLayout.NORTH);
		this.add(jtp,BorderLayout.CENTER);
		this.add(southJp,BorderLayout.SOUTH);
		
		this.setSize(300, 250);
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setIconImage(new ImageIcon("images/QQ.jpg").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
