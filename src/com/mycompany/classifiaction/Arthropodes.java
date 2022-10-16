package com.mycompany.classifiaction;

public interface Arthropodes extends Animaux {

	default void agrandirExoSquelette() {
		System.out.println("agrandi l'exosquelette");
	}
}
