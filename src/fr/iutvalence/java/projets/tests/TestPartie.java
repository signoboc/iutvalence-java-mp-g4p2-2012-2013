package fr.iutvalence.java.projets.tests;

import java.util.Random;

import fr.iutvalence.java.projets.snake.Case;
import fr.iutvalence.java.projets.snake.CoordonneesInvalideException;
import fr.iutvalence.java.projets.snake.Environnement;
import fr.iutvalence.java.projets.snake.Serpent;
import fr.iutvalence.java.projets.snake.Coordonnees;
import fr.iutvalence.java.projets.snake.Partie;

/**
 * Teste une partie.
 * @author berardk
 */
public class TestPartie
{
	
	/**
	 * Affiche la map avec le serpent.
	 * @param args : chaine de caractères symbolisant la map et le serpent
	 * @throws InterruptedException : Permet d'attendre une seconde.
	 */	
	public static void main(String[] args) throws InterruptedException
	{	
		Partie jeu = new Partie();
		
		Environnement map = new Environnement();
		Coordonnees pastille = new Coordonnees(15,10);
		Coordonnees[] positionSerpent;
		map = new Environnement();
		Serpent snake = new Serpent() ;
		
	}

	

	

}
