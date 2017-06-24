package com.Tank;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;

public class Tank {
//方向
	 int direct = 0;
	//类型
	 int type;
	 Vector<Bullet> bts = new Vector<Bullet>();
	 Bullet bt=null;
	 //子弹数量
	// int btSize=0;
	//颜色
	 int x=0,y=0;
	 boolean islife = true;
	 int speed = 5;
	 public Tank(int x,int y){
		 this.x = x;
		 this.y = y;
	 }
	 
	 public void shotEnemy(){
		 switch(this.direct){
		 //上 异常
		 case 0:
			 bt = new Bullet(this.getX()+9, this.getY()-Bullet.width,this.direct);
			 break;
			//下 正常
		 case 1:
			 bt = new Bullet(this.getX()+9, this.getY()+30,this.direct);
			 break;
			 //左 异常
		 case 2:
			 bt = new Bullet(this.getX()-Bullet.width, this.getY()+9,this.direct);
			 break;
			 //右 正常
		 case 3:
			 bt = new Bullet(this.getX()+30, this.getY()+9,this.direct);
			 break;
		 }
		bts.add(bt);
		 Thread t = new Thread(bt);
			t.start();
			Main.mp.repaint();
	 }
	 
	 
	 
	 
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//坦克移动
	public void moveUp(){
		y = y-speed;
	}
	public void moveDown(){
		y = y+speed;
	}
	public void moveLeft(){
		x = x-speed;
	}
	public void moveRight(){
		x = x +speed;
	}
}

class Hero extends Tank{
	static int type = 0;
	

	public int getType() {
		return type;
	}

	public Hero(int x, int y,int direct) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.direct = direct;
	}
	
}

class EnemyTank extends Tank{
	static int type = 1;

	 public int getType() {
		return type;
	}

	public EnemyTank(int x, int y,int direct) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.direct = direct;
	}
	
}

class Bullet implements Runnable{
	int speed=2;
	int x,y;
	int direct;
	boolean isLife = true;
	public int getSpeed() {
		return speed;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	static int width =3;
	
	public Bullet(int x,int y,int direct){
		this.x = x;
		this.y = y;
		this.direct = direct;
	}
	@Override
	public void run() {
		
		
		
		while(true){
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			switch(direct){
			//上
			case 0:
				y=y-speed;
				break;
				//下
			case 1:
				y=y+speed;
				break;
		//左
			case 2:
				x=x-speed;
				break;
				//右
			case 3:
				x=x+speed;
				break;
			}
			if(x<=0||y<=0||x>=400||y>=300){
				isLife = false;
			}

			
		}
			
	}
}
