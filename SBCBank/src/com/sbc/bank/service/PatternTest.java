package com.sbc.bank.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pat = Pattern.compile("[1-9]{1}[0-9.]{0,9}");
		Matcher mat = pat.matcher(String.valueOf(10.2));
		System.out.println(mat.matches());

	}

}
