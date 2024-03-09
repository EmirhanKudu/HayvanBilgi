package com.emir.egitimserisi;

public class StringCalismasi {
	public static void main(String[] args) {

		String sa = new String("asdas"); // 5 byte
		String ss = new String("asdas");// 5 byte

		if (sa == ss) {
			System.out.println("SA SS Eşittir");
		} else {
			System.out.println("SA SS Degildir");
		}

		String a = "abc";
		String b = "a";
		String c = "bc";
		String d = b + c;

		if (a.equals(d)) {
			System.out.println("A D Eşittir");
		} else {
			System.out.println("A D Degildir");
		}

	}
}
