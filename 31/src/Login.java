import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
	//�����������
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JTextField jtf;
	JPasswordField jpf;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lg = new Login();
	}
public Login(){
	//�������
	jp1 = new JPanel();
	jp2 = new JPanel();
	jp3 = new JPanel();
	jlb1 = new JLabel("����Ա");
	jlb2 = new JLabel("��     ��");
	jb1 = new JButton("��¼");
	jb2 = new JButton("ȡ��");
	jtf = new JTextField(10);
	jpf = new JPasswordField(10);
	
	this.setLayout(new GridLayout(3,1));
	
	jp1.add(jlb1);
	jp1.add(jtf);
	jp2.add(jlb2);
	jp2.add(jpf);
	jp3.add(jb1);
	jp3.add(jb2);
	
	this.add(jp1);
	this.add(jp2);
	this.add(jp3);
	
	this.setTitle("��Ա��¼����ϵͳ");
	this.setSize(300, 150);
	this.setLocation(200, 200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setVisible(true);
			
			
}
}
