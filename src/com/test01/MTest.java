package com.test01;

public class MTest {
	public static void main(String[] args) {
		String su = null;
		int a = 0;

		su = "10000000000";
		try {
			a = Integer.parseInt(su);
		} catch (NumberFormatException e) {
			// System.out.println(e);
			e.printStackTrace();
		} catch (IllegalArgumentException e) {

		} catch (RuntimeException e) {

		} catch (Exception e) {

		} finally {
			System.out.println("반드시 실행해야 하는것, DB, file등의 close");
		}

		System.out.println("su = " + su);
		System.out.println("a  = " + a);
	}
}
