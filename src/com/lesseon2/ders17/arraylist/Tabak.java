package com.lesseon2.ders17.arraylist;

import java.util.Random;
import java.util.UUID;

public class Tabak {
	Random rd = new Random();
	int id;
	boolean temiz;

	public Tabak() {
		super();
		this.id = id;
		this.temiz = rd.nextBoolean();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isTemiz() {
		return temiz;
	}

	public void setTemiz(boolean temiz) {
		this.temiz = temiz;
	}

	@Override
	public String toString() {
		return "Tabak [id=" + id + ", temiz=" + temiz + "]";
	}

}
