import javax.swing.*;
import java.awt.*;
public class dicWin extends JFrame{
	//�������
	JLabel jl1,jl2;
	JSplitPane jsp;
	JList jt;
	JPanel jp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dicWin dw  = new dicWin();
	}
	public dicWin(){
	//�������
	String [] str = {"boy","girl","bird"};
	
	jt = new JList(str);
	jp = new JPanel();
	jl1 = new JLabel(new ImageIcon("images/�Ұ�ѧϰ͸��.png"));
	jl2 = new JLabel("�Ұ�ѧϰ");
	
	jp.setLayout(new GridLayout(2,1));
	jp.add(jl1);
	jp.add(jl2);
	jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jt,jp);
	jsp.setOneTouchExpandable(true);
	
	
	
	
	//������
	
	this.add(jsp);
	
	this.setTitle("�Ұ�ѧϰ");
	this.setSize(600,300);
	this.setLocation(200,200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	}

}
