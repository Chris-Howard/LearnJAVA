/**
 * JComboBox/JList/JScrollPane
 * */
import java.awt.*;
import javax.swing.*;
public class userCheck extends JFrame{
//�����������
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
		//�������
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("����");
		jl2 = new JLabel("���ε�");
		
		String [] str ={"����","����","�㶫","��ɳ","����"};
		JComboBox jc = new JComboBox(str);
		
		String [] st = {"����","�Ĵ�","����","LA","����","����"};
		jt = new JList(st);
		jt.setVisibleRowCount(2);
		
		jsp = new JScrollPane(jt);
		//���ò���
		this.setLayout(new GridLayout(2,1));
		
		jp1.add(jl1);
		jp1.add(jc);
		
		jp2.add(jl2);
		//jp2.add(jt);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		
		//���ô�������
		this.setTitle("�û�����");
		this.setSize(600, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}

}
