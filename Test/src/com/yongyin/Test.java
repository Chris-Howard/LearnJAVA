package com.yongyin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

//import java.awt.*;
import javax.swing.*;
public class Test extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt = new Test();
	}
public  Test(){
	this.setTitle("边界布局案例");
	this.setSize(500, 500);
	this.setLocation(200, 200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	jb1 = new JButton("中部");
	jb2 = new JButton("北部");
	jb3 = new JButton("东部");
	jb4 = new JButton("南部");
	jb5 = new JButton("西部");
	
	this.setLayout(new FlowLayout(FlowLayout.LEADING));
	
	this.add(jb1);
	this.add(jb2);
	this.add(jb3);
	this.add(jb4);
	this.add(jb5);
	//this.setResizable(false);
	
	this.setVisible(true);
}
}