package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("kinder", "merendina", 2.f, 10);
		System.out.println(p1.toString());
		
		System.out.println("----------------------------------------------");
		System.out.println("Description: " + p1.getDescrizione());
		
		p1.setPrezzo(3.f);
		System.out.println("----------------------------------------------");
		System.out.println(p1.toString());
		
		System.out.println("----------------------------------------------");
		System.out.println("Codice originale: " + p1.getCodice());
		System.out.println("Codice a otto cifre: " + p1.codiceToOttoCifre());
	}
}
