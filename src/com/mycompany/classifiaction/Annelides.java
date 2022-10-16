package com.mycompany.classifiaction;

public abstract class Annelides implements Animaux {

	public Annelides() {
		this.bougerCorpsEnSegment();
		this.mangerConstituantOrganique();
	}

	public void bougerCorpsEnSegment() {
		System.out.println("bouge son corps en segment");
	}
}
