package com.lesseon2.ders17;

public class Menu {
	Gun gun;
	Yemek yemek;
	Tatli tatli;
	Corba corba;
	Icecek icecek;

	public Menu() {
		super();
	}

	public Menu(Gun gun, Yemek yemek, Tatli tatli, Corba corba, Icecek icecek) {
		super();
		this.gun = gun;
		this.yemek = yemek;
		this.tatli = tatli;
		this.corba = corba;
		this.icecek = icecek;
	}

	@Override
	public String toString() {
		return "Menu [gun=" + gun + ", yemek=" + yemek + ", tatli=" + tatli + ", corba=" + corba + ", icecek=" + icecek
				+ "]";
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}

	public Yemek getYemek() {
		return yemek;
	}

	public void setYemek(Yemek yemek) {
		this.yemek = yemek;
	}

	public Tatli getTatli() {
		return tatli;
	}

	public void setTatli(Tatli tatli) {
		this.tatli = tatli;
	}

	public Corba getCorba() {
		return corba;
	}

	public void setCorba(Corba corba) {
		this.corba = corba;
	}

	public Icecek getIcecek() {
		return icecek;
	}

	public void setIcecek(Icecek icecek) {
		this.icecek = icecek;
	}

}
