/**
 *���ߣ�Mr.��
 *���ܣ��������񲼾� 
 * 1.�����
 * 2.����ؼ�
 * */
package com.yongyin;

import java.awt.*;
import javax.swing.*;
public class demo1 extends JFrame{
	int size=9;
	JButton jb[] = new JButton[size];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 demo = new demo1();
		System.out.println("Test");
	}
	
	public demo1(){
		//�������
		for(int i=0;i<size;i++){
			jb[i]=new JButton(String.valueOf(i));
		}
		
		//�������񲼾� 
		this.setLayout(new GridLayout(3,3,10,10));
		//���ô�������
		this.setTitle("�������񲼾�");
		this.setSize(300,200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		
		//��ӿؼ�
		for(int i=0;i<size;i++){
			this.add(jb[i]);
		}
		//��ʾ����
		this.setVisible(true);
	}

}
