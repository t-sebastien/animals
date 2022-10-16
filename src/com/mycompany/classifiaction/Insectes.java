package com.mycompany.classifiaction;

public abstract class Insectes implements Arthropodes {

	public Insectes() {
		this.agrandirExoSquelette();
		this.bougerTroisPairesDePattes();
		this.mangerConstituantOrganique();
	}

	public void bougerTroisPairesDePattes() {
		System.out.println("peut bouger trois paires de pattes");
	}
}
