/**
 * ���ߣ�������
 * ���ܣ�JPanel��ʹ��
 * */
import java.awt.*;
import javax.swing.*;
public class Test extends JFrame {
//�����������
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt = new Test();
	}
	public Test(){
		//���������������
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("����");
		jb2=new JButton("ƻ��");
		jb3=new JButton("�㽶");
		jb4=new JButton("����");
		jb5=new JButton("����");
		jb6=new JButton("����");
		
		//���ò���
		
		//���������Jpanel��Jframe
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		//���ô�������
		this.setTitle("JPanel����");
		this.setSize(300,200);
		this.setLocation(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//���ÿɼ�
		this.setVisible(true);
		
		
		
		
		
	}

}
