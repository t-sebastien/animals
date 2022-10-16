package com.mycompany;

import com.mycompany.type.*;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) {
		toString(Panda.class);
		toString(Zebre.class);
		toString(Escargot.class);
		toString(Moule.class);
		toString(Mouche.class);
		toString(Abeille.class);
		toString(VerDeTerre.class);
		toString(Homard.class);

	}

	public static void toString(Class animaux) {
		try {
			System.out.println("Un " + animaux.getSimpleName() + " :");
			animaux.getDeclaredConstructor().newInstance();
			System.out.println("----");
		} catch (IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
