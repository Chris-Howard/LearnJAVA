import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;

public class Test extends JFrame implements ActionListener {
	//定义组件
	JButton jb1,jb2;
	//JButton jb2;
	JPanel jp;
	static String stRed = "红色",stBla = "黑色";
	
//	MyJPanel mj;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test tt = new Test();
	}
	
	//创建组件
	public Test(){
		jb1 = new JButton(stBla);
		
		
		jb2 = new JButton(stRed);
		
		jp = new JPanel();
		jp.setBackground(Color.black);
		
		jb1.addActionListener(this);
		jb1.setActionCommand(stBla);
		jb2.addActionListener(this);
		jb2.setActionCommand(stRed);
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(jp);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(stBla)){
			jp.setBackground(Color.black);
		}
		else if(e.getActionCommand().equals(stRed)){
			jp.setBackground(Color.RED);
		}
	}

}

//class MyJPanel extends JPanel{
//	public void paint(Graphics g){
//		super.paint(g);
//		
//	}
//}
