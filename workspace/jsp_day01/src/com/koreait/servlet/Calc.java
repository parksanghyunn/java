package com.koreait.servlet;

public class Calc {
	public int plus(String [] arNum) {
		int num = 0;
		for (int i = 0; i < arNum.length; i++) {
			num += Integer.parseInt(arNum[i]);
		}
		return num;
	}
	public int minus(String [] arNum) {
		int num = 0;
		for (int i = 0; i < arNum.length; i++) {
			if(num == 0) {
				num = Integer.parseInt(arNum[i]);
			}else {
				num = num - Integer.parseInt(arNum[i]);
			}
		}
		return num;
		
	}
	public int mul(String [] arNum) {
		int num = 0;
		for (int i = 0; i < arNum.length; i++) {
			if(num == 0) {
				num = Integer.parseInt(arNum[i]);
			}else {
				num = num * Integer.parseInt(arNum[i]);
			}
		}
		return num;
		
	}
	public int div(String [] arNum) {
		int num = 0;
		for (int i = 0; i < arNum.length; i++) {
			if(num == 0) {
				num = Integer.parseInt(arNum[i]);
			}else {
				num = num / Integer.parseInt(arNum[i]);
			}
		}
		return num;
		
	}
	
	public static void main(String[] args) {
		
	}
}
