/**
 *作者：Mr.胡
 *功能：测试网格布局 
 * 1.导入包
 * 2.定义控件
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
		//创建组件
		for(int i=0;i<size;i++){
			jb[i]=new JButton(String.valueOf(i));
		}
		
		//设置网格布局 
		this.setLayout(new GridLayout(3,3,10,10));
		//设置窗体属性
		this.setTitle("测试网格布局");
		this.setSize(300,200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		
		//添加控件
		for(int i=0;i<size;i++){
			this.add(jb[i]);
		}
		//显示窗口
		this.setVisible(true);
	}

}
