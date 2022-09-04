package com.lesseon2.ders17.arraylist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PideKuyrugu {

	public static void main(String[] args) throws InterruptedException {
		Queue<String> kuyruk = new LinkedList<String>();
		kuyruk.add("Ahmet");
		kuyruk.add("Mehmet");
		kuyruk.add("Ali");
		kuyruk.add("Hasan");
		kuyruk.add("Hamza");
		kuyruk.add("Halil");
		kuyruk.add("Ayse");
		kuyruk.add("Fatma");
		kuyruk.add("Merve");
		kuyruk.add("Gamze");
		kuyruk.add("Zeynep");
		kuyruk.add("Esra");

		Random random = new Random();
		int index = 1 + random.nextInt(10);
		System.out.println("Pideler cikiyor");
		System.out.println("Cikan pide sayisi..:" + index);
		for (int i = 0; i < index; i++) {
			System.out.println(kuyruk.poll());
			Thread.sleep(1000);
		}
		System.out.println("Pide bitti.");
		kuyruk.forEach(System.out::println);

	}

}
