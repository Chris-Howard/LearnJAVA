import javax.swing.*;
import java.awt.*;
public class dicWin extends JFrame{
	//定义组件
	JLabel jl1,jl2;
	JSplitPane jsp;
	JList jt;
	JPanel jp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dicWin dw  = new dicWin();
	}
	public dicWin(){
	//创建组件
	String [] str = {"boy","girl","bird"};
	
	jt = new JList(str);
	jp = new JPanel();
	jl1 = new JLabel(new ImageIcon("images/我爱学习透明.png"));
	jl2 = new JLabel("我爱学习");
	
	jp.setLayout(new GridLayout(2,1));
	jp.add(jl1);
	jp.add(jl2);
	jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jt,jp);
	jsp.setOneTouchExpandable(true);
	
	
	
	
	//添加组件
	
	this.add(jsp);
	
	this.setTitle("我爱学习");
	this.setSize(600,300);
	this.setLocation(200,200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	}

}
