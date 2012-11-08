package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Serpent;

/**
 * Teste le serpent.
 * @author berardk
 */
public class TestSerpent
{

	/**
	 * Affiche la chaine de caract�res r�sultat de la m�thode ToString de la classe Serpent
	 * On peut ainsi lire les caract�ristiques du serpent � l'initialisation.
	 * @param args : chaine de caract�res symbolisant le serpent.
	 */
	public static void main(String[] args)
	{
		Serpent test = new Serpent() ;
		System.out.println(test);

	}

}


