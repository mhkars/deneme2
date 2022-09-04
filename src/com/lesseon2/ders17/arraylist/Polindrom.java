package com.lesseon2.ders17.arraylist;

import java.util.Scanner;
import java.util.Stack;

public class Polindrom {
	static Stack<Character> list = new Stack<Character>();
	static Scanner scanner = new Scanner(System.in);

	public static String metinAl() {
		System.out.println("Bir metin giriniz..:");
		String metin = scanner.nextLine();

		for (int i = 0; i < metin.length(); i++) {
			list.push(metin.charAt(i));
		}
		list.forEach(l -> System.out.println(l));
		return metin;

	}

	public static boolean polindrom(String string, Stack<Character> stack) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != stack.pop())
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String text = metinAl();
		System.out.println(polindrom(text, list));

	}

}
