package com.mycompany.classifiaction;

public abstract class Mollusques implements Animaux {

	public Mollusques() {
		this.creerCoquille();
		this.mangerConstituantOrganique();
	}

	public void creerCoquille() {
		System.out.println("créer sa coquille");
	}
}
