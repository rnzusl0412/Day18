package com.test02;

public class MTest01 {
	public static void main(String[] args) {
		int su = -5;
		if (su < 0) {
			try {
				throw new MException("����� �Է���");
			} catch (MException e) { // MException e = new MException();
				System.out.println(e);
				System.out.println(e.getMessage());
			} catch (Exception ee) {
				System.out.println("Exception ee : " + ee);
			}
		}
	}
}
