package com.test02;

@SuppressWarnings("serial")

class MException extends Exception {

	@Override
	public String toString() {
		return "��  �̰� ������.";
	}

	public MException(String message) {
		System.out.println(message);
	}

}
