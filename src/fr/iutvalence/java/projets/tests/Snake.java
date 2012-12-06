package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Partie;
import fr.iutvalence.java.projets.snake.Aff;
import fr.iutvalence.java.projets.snake.AffConsole;
import fr.iutvalence.java.projets.snake.Controle;

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
		Aff a = new AffConsole();
		Controle c = new GestionClavier();
		Partie p = new Partie(a,c);
		p.demarrer();
	}

}
