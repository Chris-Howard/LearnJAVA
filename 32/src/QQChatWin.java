import java.awt.*;
import javax.swing.*;
public class QQChatWin extends JFrame {
	//�������
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
	//�������
	String [] Chatter = {"��ʲ","�ֿ�"}; 
	jcb = new JComboBox(Chatter);
	jtf = new JTextField(10); 
	jta = new JTextArea();
	jb = new JButton("����");
	js = new JScrollPane(jta);
	jp =new JPanel();
	//���ò���
	
	//this.setLayout(new BorderLayout());
	
	jp.add(jcb);
	jp.add(jtf);
	jp.add(jb);
	
	this.add(js);
	this.add(jp,BorderLayout.SOUTH);
	
	
	this.setSize(300, 150);
	this.setIconImage(new ImageIcon("images\\��.gif").getImage());
	this.setLocation(200, 200);
	this.setTitle("QQ����");
	//this.setIconImage(images/�Ұ�ѧϰ͸��.png);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
}
}
