package com.emir.egitimserisi;

public class StatikEgitim {

	public static void main(String[] args) {
		StatikDeneme statikDeneme = new StatikDeneme();
		statikDeneme.sayacArttir();
		statikDeneme.sayacArttir();
		statikDeneme.staticSayacArttir();
		statikDeneme.staticSayacArttir();
		statikDeneme.staticSayacArttir();

		StatikDeneme statikDeneme2 = new StatikDeneme();
		statikDeneme2.sayacArttir();
		statikDeneme2.staticSayacArttir();

		System.out.println("Sayac :" + statikDeneme.getSayac());
		System.out.println("Statik :" + statikDeneme.getStaticSayac());
		System.out.println("Sayac2 :" + statikDeneme2.getSayac());
		System.out.println("Statik2 :" + statikDeneme2.getStaticSayac());
	}

}
