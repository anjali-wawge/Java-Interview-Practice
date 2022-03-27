package com.arrayPrograms;

public class CharArrayToString {
	public static void main(String[] args) {
		char charArray[] = new char[] {'J','A','V','A'};
		// System.out.println(String.copyValueOf(charArray));or
		String str=new String(charArray);
		System.out.println(str);
	}

}
