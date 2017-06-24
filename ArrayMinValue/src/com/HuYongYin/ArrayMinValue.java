package com.HuYongYin;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ArrayMinValue extends JFrame implements ActionListener
{
    // 定义组件
    JLabel jl1, jl2, jl3;
    JButton jb;
    JTextField jtf;
    JPanel jp;

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	ArrayMinValue amv = new ArrayMinValue();

    }

    public ArrayMinValue()
    {
	sw();
	jb.addActionListener(this);

    }
    
  private void getMinValue(){
      String string = jtf.getText().trim();
	if (string.equals(""))
	{
	    JOptionPane.showMessageDialog(null, "请输入数字内容");
	    return;
	}
	for (int i = 0; i < string.length(); i++)
	{
	    char charAT = string.charAt(i);
	    if (!Character.isDigit(charAT) && charAT != ' ')
	    {
		JOptionPane.showMessageDialog(null, "你输入包含非数字内容");
		jtf.setText("");
		return;
	    }
	}
	String buff[] = string.split(" +");
	int numArray[] = new int[buff.length];
	for (int i = 0; i < numArray.length; i++)
	{
	    numArray[i] = Integer.valueOf(buff[i]);
	}
	int min = numArray[0];
	for (int j = 0; j < numArray.length; j++)
	{
	    if (min > numArray[j])
	    {
		min = numArray[j];
	    }
	}
	jl3.setText(String.valueOf(min));
      
  }

    private void sw()
    {
	String str = "请在文本框中输入多个整数，用空格隔开。例如：3 5 355 27   64";
	jl1 = new JLabel(str);
	String str1 = "数组中最小的数是：";
	String str2 = "";
	jl2 = new JLabel(str1);
	jl3 = new JLabel(str2);
	jp = new JPanel();
	jb = new JButton("计算");
	jtf = new JTextField();

	jp.add(jb);
	jp.add(jl2);
	jp.add(jl3);

	this.add(jl1, BorderLayout.NORTH);
	this.add(jtf, BorderLayout.CENTER);
	this.add(jp, BorderLayout.SOUTH);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocation(200, 200);
	this.setSize(400, 110);
	this.setResizable(false);
	this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
	// TODO Auto-generated method stub
	getMinValue();

    }

}
