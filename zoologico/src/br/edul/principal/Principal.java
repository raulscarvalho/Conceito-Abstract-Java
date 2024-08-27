package br.edul.principal;

import br.edul.animais.Animais;
import br.edul.animais.Cat;

public class Principal {

	public static void main(String[] args) {
		Animais a1 = criaAnimal("Gato");

	}

	public static Animais criaAnimal(String tipo) {
		
		if (tipo  == null) {
			System.out.println("Nenhum animal gerado");
		}
		else if (tipo.equals("Cat")) {
			System.out.println("Gato gerado");
			return new Cat();
		}
		return null;
	}

}
