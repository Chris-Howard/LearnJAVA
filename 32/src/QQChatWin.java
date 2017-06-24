import java.awt.*;
import javax.swing.*;
public class QQChatWin extends JFrame {
	//定义组件
	JComboBox jcb;
	JTextField jtf;
	JTextArea jta;
	JButton jb;
	JPanel jp;
	JScrollPane js;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQChatWin cw = new QQChatWin();
	}
public QQChatWin(){
	//创建组件
	String [] Chatter = {"布什","林肯"}; 
	jcb = new JComboBox(Chatter);
	jtf = new JTextField(10); 
	jta = new JTextArea();
	jb = new JButton("发送");
	js = new JScrollPane(jta);
	jp =new JPanel();
	//设置布局
	
	//this.setLayout(new BorderLayout());
	
	jp.add(jcb);
	jp.add(jtf);
	jp.add(jb);
	
	this.add(js);
	this.add(jp,BorderLayout.SOUTH);
	
	
	this.setSize(300, 150);
	this.setIconImage(new ImageIcon("images\\树.gif").getImage());
	this.setLocation(200, 200);
	this.setTitle("QQ聊天");
	//this.setIconImage(images/我爱学习透明.png);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
}
}
