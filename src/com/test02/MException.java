package com.test02;

@SuppressWarnings("serial")

class MException extends Exception {

	@Override
	public String toString() {
		return "야  이거 음수다.";
	}

	public MException(String message) {
		System.out.println(message);
	}

}
