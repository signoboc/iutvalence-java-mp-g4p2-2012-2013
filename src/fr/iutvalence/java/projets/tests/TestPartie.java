package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Environnement;
import fr.iutvalence.java.projets.snake.Serpent;
import fr.iutvalence.java.projets.snake.Coordonnees;

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
	
	private static String gameOver = "GAME OVER !\n";
	
	public static void main(String[] args) throws InterruptedException
	{
		Environnement map = new Environnement();
		Coordonnees pastille = map.genererNouvellePastille();
		int absPast = pastille.getAbscisse();
		int ordPast = pastille.getOrdonnee();
		map = new Environnement(pastille);
		Serpent snake = new Serpent() ;
		while(true)
		{
			Thread.sleep(500);
			snake.DeplacerSerpent();
			
			// Récupération des coordonnées de la tête:
			Coordonnees[] positionTete = snake.getPosition();
			int absTete = positionTete[0].getAbscisse();
			int ordTete = positionTete[0].getOrdonnee();
			
			// Comparaison de coordonnées de la tête et des murs:
			if ((absTete == 0) || (absTete == Environnement.TAILLEGRILLE -1) || (ordTete == 0) || (ordTete == Environnement.TAILLEGRILLE -1))
			{
				System.out.print(gameOver);
				break;
			}
			if ((absTete == absPast ) && (ordTete == ordPast))
			{
				//Incrémentation de la longueur du serpent.
				int longSerp = snake.getLongueur();
				longSerp++;
				snake.setLongueur(longSerp);
				
				//Rajouter un élément au tableau de position du serpent.
				
				
				//Générer une nouvelle pastille (dans la variable pastille).
			}
			map = new Environnement(pastille);
			map.placerSerpent(snake);
			System.out.println(map);
			
		}
	}

}
