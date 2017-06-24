package com.yongyin;

import java.text.NumberFormat;

public class Test_DecimalFormat {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Pi = 3.141593653;
		NumberFormat form;
		form = NumberFormat.getNumberInstance();
		form.setMaximumFractionDigits(6);
		
		System.out.println("Pi->"+form.format(Pi));

	}

}
