import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class moveBall extends JFrame  {
	
	//
	MyPanel mp = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			moveBall mb = new moveBall();
	}
	public moveBall(){
		mp = new MyPanel();
		
		this.add(mp);
		this.addKeyListener(mp);
		
		this.setSize(600, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 200);
		this.setVisible(true);
	}

	
}

class MyPanel extends JPanel implements KeyListener{
	int x=10;
	int y=10;
	int speed =5;
	int r=10;
	public void paint(Graphics g)
	{	
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 400, 300);
		g.setColor(Color.BLACK);
		g.fillOval(x, y, r, r);
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		if(e.getKeyCode()==KeyEvent.VK_DOWN){
//			y++;
//			System.out.println("ио");
//		}
//		else if(e.getKeyCode()==KeyEvent.VK_S){
//			y--;
//		}
//		else if(e.getKeyCode()==KeyEvent.VK_A){
//			x--;
//		}
//		else if(e.getKeyCode() == KeyEvent.VK_D){
//			x++;
//		}
		//this.repaint();
	
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			if(y<300)
			y=y+speed;
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP){
			if(y>0)
		y-=speed;
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			if(x>0)
			x-=speed;
		}
	else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
		if(x <400)
		x+=speed;
		}
		this.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
