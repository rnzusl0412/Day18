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
			System.out.println("�ݵ�� �����ؾ� �ϴ°�, DB, file���� close");
		}

		System.out.println("su = " + su);
		System.out.println("a  = " + a);
	}
}
