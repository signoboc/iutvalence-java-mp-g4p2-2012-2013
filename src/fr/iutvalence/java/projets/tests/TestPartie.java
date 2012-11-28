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
		int absPast;
		int ordPast;
		int absTete;
		int ordTete;
		
		Environnement map = new Environnement();
		Coordonnees pastille = map.genererNouvellePastille();
		pastille.setAbscisse(14);
		pastille.setOrdonnee(10);

		map = new Environnement(pastille);
		Serpent snake = new Serpent() ;
		while(true)
		{
			Thread.sleep(500);
			snake.DeplacerSerpent();
			
			// Récupération des coordonnées de la tête et de la pastille:
			Coordonnees[] positionTete = snake.getPosition();
			absTete = positionTete[0].getAbscisse();
			ordTete = positionTete[0].getOrdonnee();
			absPast = pastille.getAbscisse();
			ordPast = pastille.getOrdonnee();
			
			// Comparaison de coordonnées de la tête et des murs:
			if ((absTete == 0) || (absTete == Environnement.TAILLEGRILLE -1) || (ordTete == 0) || (ordTete == Environnement.TAILLEGRILLE -1))
			{
				System.out.print(gameOver);
				break;
			}
			if ( (absTete == absPast ) && (ordTete == ordPast))
			{
				//Incrémentation de la longueur du serpent.
				int longSerp = snake.getLongueur();
				longSerp++;
				snake.setLongueur(longSerp);
				
				//Rajouter un élément au tableau de position du serpent.
				
				
				//Générer une nouvelle pastille (dans la variable pastille).
				pastille = map.genererNouvellePastille();
			}
			map = new Environnement(pastille);
			map.placerSerpent(snake);
			System.out.println(map);
			
		}
	}

}
