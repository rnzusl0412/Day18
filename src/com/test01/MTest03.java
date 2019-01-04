package com.test01;

public class MTest03 {
	public static void Prn01() throws Exception {
		throw new Exception();
	}

	public static void Prn02() throws Exception {
		Prn01();
	}

	public static void main(String[] args) {
		try {
			Prn02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
