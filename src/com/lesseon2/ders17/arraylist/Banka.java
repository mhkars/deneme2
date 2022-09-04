package com.lesseon2.ders17.arraylist;

import java.util.PriorityQueue;
import java.util.Queue;

public class Banka {
	public static void main(String[] args) {
		Musteri musteri;
		Queue<Musteri> musteriList = new PriorityQueue<Musteri>();
		musteriList.offer(new Musteri("ahmet", 15));
		musteriList.offer(new Musteri("mehmet", 35));
		musteriList.offer(new Musteri("ziya", 45));
		musteriList.offer(new Musteri("necip", 75));
		musteriList.offer(new Musteri("gul", 85));
		musteriList.offer(new Musteri("lale", 25));
		musteriList.offer(new Musteri("menekse", 55));
		int i = 1;

		while (!musteriList.isEmpty()) {
			System.out.println("***************");
			System.out.println(i + ". sirada" + musteriList.poll());
			i++;
		}

	}
}