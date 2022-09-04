package com.lesseon2.ders17.arraylist;

import java.util.Stack;

public class TabakTest<E> {
	static Stack<Tabak> temizlist = new Stack<Tabak>();
	static Stack<Tabak> kirlilist = new Stack<Tabak>();

	public static void main(String[] args) {
		TabakTest test = new TabakTest();
		test.randomTabakUret(10);
		test.temizle(kirlilist);
		temizlist.forEach(s -> System.out.println(s));
		System.out.println("-----------------------");
		kirlilist.forEach(s -> System.out.println(s));

	}

	public void randomTabakUret(int i) {
		Tabak tabak;

		while (i != 0) {
			tabak = new Tabak();
			tabak.setId(i);
			if (tabak.temiz) {
				temizlist.push(tabak);
			} else {
				kirlilist.push(tabak);
			}
			i--;
		}
		temizlist.forEach(s -> System.out.println(s));
		System.out.println("-----------------------");
		kirlilist.forEach(s -> System.out.println(s));
		System.out.println("***********************");
	}

	public void temizle(Stack<E> list) {
		Tabak tabak = kirlilist.pop();
		tabak.setTemiz(true);
		temizlist.push(tabak);
		System.out.println(tabak.id + " temizlendi");

	}

}
