package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Serpent;

/**
 * Teste le serpent.
 * @author berardk
 */
public class TestSerpent
{

	/**
	 * Affiche la chaine de caractères résultat de la méthode ToString de la classe Serpent
	 * On peut ainsi lire les caractéristiques du serpent à l'initialisation.
	 * @param args : chaine de caractères symbolisant le serpent.
	 */
	public static void main(String[] args)
	{
		Serpent test = new Serpent() ;
		System.out.println(test);

	}

}


