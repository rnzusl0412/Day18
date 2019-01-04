package com.test01;

public class MTest02 {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			try {		//checked exception
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%3c",'¢½');
		}
	}
}
