package com.Tank;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class Main extends JFrame{
	static MyPanel mp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main mn = new Main();
	}
	public Main(){
		mp = new MyPanel();
		
		this.addKeyListener(mp);
		
		
		
		this.add(mp);
		//mp.setLocation(50, 50);
		//mp.setSize(200, 200);

		this.setSize(600,600);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}

class MyPanel extends JPanel implements KeyListener{
	Hero hero = new Hero(200, 200, 0);
	Vector<EnemyTank> etk = new Vector<EnemyTank>();
	int enSize = 3;

	
	public MyPanel(){
		for(int i = 0;i<enSize;i++){
		EnemyTank et = new EnemyTank((i+1)*50, 0, 1);
		etk.add(et);
		}
				
}
	public void hitEnTank(){

		for(int i=0;i<hero.bts.size();i++){
		Bullet mybt = hero.bts.get(i);
		for(int j =0;j<etk.size();j++){
			EnemyTank Em  = etk.get(j);
			switch(Em.direct){
			case 0:
			case 1:
				if(mybt.getX()>Em.getX()
				&&mybt.getX()<Em.getX()+20
				&&mybt.getY()>Em.getY()
				&&mybt.getY()<Em.getY()+30){
					mybt.isLife = false;
					Em.islife = false;
					etk.remove(Em);
					hero.bts.remove(mybt);
					break;
					}
			case 2:
			case 3:
				if(mybt.getX()>Em.getX()
						&&mybt.getX()<Em.getX()+30
						&&mybt.getY()>Em.getY()
						&&mybt.getY()<Em.getY()+20){
							mybt.isLife = false;
							Em.islife = false;
							etk.remove(Em);
							hero.bts.remove(mybt);
							break;
			}
		}
		}
}
	}
	
	public void paint(Graphics g){
		
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		this.drawTank(hero, g);
		
		
		hitEnTank();
		for(int i = 0;i<hero.bts.size();i++){
			Bullet shot = hero.bts.get(i);
			if(!shot.isLife)hero.bts.remove(shot);
		if (shot!=null&&shot.isLife){
			g.fill3DRect(shot.getX(), shot.getY(), shot.width, shot.width , false);
		}
		}
	
		for(int j =0;j<etk.size();j++){
			
			if(etk.get(j).islife)
			{
			this.drawTank(etk.get(j), g);}
			else{
				etk.remove(j);
			}
		}

			
		
		
	}

	//画坦克
	public void drawTank(Tank tk,Graphics g){
		
		switch(tk.getType()){
			case 0:
				g.setColor(Color.CYAN);
				
				break;
			case 1:
				g.setColor(Color.YELLOW);
				break;
		}
		
		switch(tk.direct){
		//向上
		case 0:
			g.fill3DRect(tk.getX(), tk.getY(), 5, 30, false);
			g.fill3DRect(tk.getX()+15, tk.getY(), 5, 30, false);
			g.fill3DRect(tk.getX()+5, tk.getY()+5, 10, 20, false);
			g.fillOval(tk.getX()+5, tk.getY()+10, 10, 10);
			g.drawLine(tk.getX()+10, tk.getY()+15, tk.getX()+10, tk.getY());
			break;
		//向下
		case 1:
			g.fill3DRect(tk.getX(), tk.getY(), 5, 30, false);
			g.fill3DRect(tk.getX()+15, tk.getY(), 5, 30, false);
			g.fill3DRect(tk.getX()+5, tk.getY()+5, 10, 20, false);
			g.fillOval(tk.getX()+5, tk.getY()+10, 10, 10);
			g.drawLine(tk.getX()+10, tk.getY()+15, tk.getX()+10, tk.getY()+30);
			break;
			//向左
		case 2:
			g.fill3DRect(tk.getX(), tk.getY(), 30, 5, false);
			g.fill3DRect(tk.getX(), tk.getY()+15, 30, 5, false);
			g.fill3DRect(tk.getX()+5, tk.getY()+5, 20, 10, false);
			g.fillOval(tk.getX()+10, tk.getY()+5, 10, 10);
			g.drawLine(tk.getX()+15, tk.getY()+10, tk.getX(), tk.getY()+10);
			break;
		case 3:
			g.fill3DRect(tk.getX(), tk.getY(), 30, 5, false);
			g.fill3DRect(tk.getX(), tk.getY()+15, 30, 5, false);
			g.fill3DRect(tk.getX()+5, tk.getY()+5, 20, 10, false);
			g.fillOval(tk.getX()+10, tk.getY()+5, 10, 10);
			g.drawLine(tk.getX()+15, tk.getY()+10, tk.getX()+30, tk.getY()+10);
			break;
			
		
		}
		
		repaint();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_J){
			if(hero.bts.size()<=4)
			hero.shotEnemy();
		}
		
		if(e.getKeyCode()==KeyEvent.VK_A){
			hero.setDirect(2);
			if(hero.getX()>0){
			hero.moveLeft();}
			//repaint();
			}
		else if(e.getKeyCode()==KeyEvent.VK_D){
			hero.setDirect(3);
			if(hero.getX()<400-30)
			hero.moveRight();
		}
		else if(e.getKeyCode()==KeyEvent.VK_W){
			hero.setDirect(0);
			if(hero.getY()>0)
			hero.moveUp();
		}
		else if(e.getKeyCode()==KeyEvent.VK_S){
			hero.setDirect(1);
			if(hero.getY()<300-30)
			hero.moveDown();
		}
		
		
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}