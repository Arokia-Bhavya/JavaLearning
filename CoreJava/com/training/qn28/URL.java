package com.training.qn28;

public class URL {

	public static void main(String[] args) {
		String url="http://www.amazon.com/";
		System.out.println("The given "+url+" is "+(isSecureURL(url)?"secure":"not secure"));
		url="https://www.amazon.com/";
		System.out.println("The given "+url+" is "+(isSecureURL(url)?"secure":"not secure"));
	}

	private static boolean isSecureURL(String url) {
		return url.startsWith("https");
	}

}
