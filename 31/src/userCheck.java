/**
 * JComboBox/JList/JScrollPane
 * */
import java.awt.*;
import javax.swing.*;
public class userCheck extends JFrame{
//定义所需组件
	JPanel jp1,jp2;
	JLabel  jl1,jl2;
	JComboBox jc;
	JList jt;
	JScrollPane jsp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userCheck uc = new userCheck();
	}
	public userCheck(){
		//创建组件
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("籍贯");
		jl2 = new JLabel("旅游地");
		
		String [] str ={"北京","内蒙","广东","长沙","岳阳"};
		JComboBox jc = new JComboBox(str);
		
		String [] st = {"云南","四川","西藏","LA","康桥","长城"};
		jt = new JList(st);
		jt.setVisibleRowCount(2);
		
		jsp = new JScrollPane(jt);
		//设置布局
		this.setLayout(new GridLayout(2,1));
		
		jp1.add(jl1);
		jp1.add(jc);
		
		jp2.add(jl2);
		//jp2.add(jt);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		
		//设置窗口属性
		this.setTitle("用户调查");
		this.setSize(600, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}

}
