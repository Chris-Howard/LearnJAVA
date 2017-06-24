/**
 * 作者：胡勇银
 * 功能：JPanel的使用
 * */
import java.awt.*;
import javax.swing.*;
public class Test extends JFrame {
//定义所需组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt = new Test();
	}
	public Test(){
		//创建所需组件对象
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("西瓜");
		jb2=new JButton("苹果");
		jb3=new JButton("香蕉");
		jb4=new JButton("葡萄");
		jb5=new JButton("橘子");
		jb6=new JButton("甘蔗");
		
		//设置布局
		
		//把组件放入Jpanel和Jframe
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		//设置窗体属性
		this.setTitle("JPanel测试");
		this.setSize(300,200);
		this.setLocation(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//设置可见
		this.setVisible(true);
		
		
		
		
		
	}

}
