package com.emir.egitimserisi;

public class HayvanEgitim {

	public static void main(String[] args) {

		Inek inek = new Inek(true);
		Hayvan inek2 = new Inek(false);

		System.out.println(inek);

		Inek someInek = (Inek) inek2;

		HayvanEgitim.isimYazdir(inek2);

		Hayvan tavuk = new Tavuk();

		Kedi kedi = new Kedi();

		HayvanEgitim.isimYazdir(tavuk);

	}

	public static void isimYazdir(Hayvan hayvan) {

		if (hayvan instanceof Inek) {
			Inek someInek = (Inek) hayvan;
			System.out.println(someInek);
		}

	}
}
