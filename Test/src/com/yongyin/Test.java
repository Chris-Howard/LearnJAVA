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
	this.setTitle("�߽粼�ְ���");
	this.setSize(500, 500);
	this.setLocation(200, 200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	jb1 = new JButton("�в�");
	jb2 = new JButton("����");
	jb3 = new JButton("����");
	jb4 = new JButton("�ϲ�");
	jb5 = new JButton("����");
	
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