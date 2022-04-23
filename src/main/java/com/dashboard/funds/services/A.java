package com.dashboard.funds.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class A {
	
	private static String format;

	public static void main(String[] args) {

			int decimalPlaces = 0 ;
		    BigDecimal bd = new BigDecimal("553456789.0663456890");
		    bd = bd.setScale(decimalPlaces, RoundingMode.FLOOR);
		    System.out.println(bd);
		
	}
}
