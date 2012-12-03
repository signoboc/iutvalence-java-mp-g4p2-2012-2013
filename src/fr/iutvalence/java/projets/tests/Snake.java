package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Partie;
import fr.iutvalence.java.projets.snake.Fenetre;

/**
 * Classe qui lance la partie.
 * @author REEKER
 *
 */
public class Snake
{

	/**
	 * @param args .
	 * @throws InterruptedException : Exception du sleep.
	 */
	public static void main(String[] args) throws InterruptedException
	{
		//Fenetre fen = new Fenetre();
		new Partie().demarrer();
	}

}
