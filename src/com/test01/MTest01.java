package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int res = 0;
		a = 100;
		
		try {
		res = a/b;
		} catch (ArithmeticException e) {
			System.out.println(e);
			b = 50;	// 에러난 코드를 처리한다.
			res = a/b;
		} 
		
		System.out.println("a = "+ a + "  b ="+b + "  res = "+res);
	}
}
