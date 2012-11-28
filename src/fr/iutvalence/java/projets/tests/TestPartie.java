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
	 * @param args : chaine de caract�res symbolisant la map et le serpent
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
			
			// R�cup�ration des coordonn�es de la t�te et de la pastille:
			Coordonnees[] positionTete = snake.getPosition();
			absTete = positionTete[0].getAbscisse();
			ordTete = positionTete[0].getOrdonnee();
			absPast = pastille.getAbscisse();
			ordPast = pastille.getOrdonnee();
			
			// Comparaison de coordonn�es de la t�te et des murs:
			if ((absTete == 0) || (absTete == Environnement.TAILLEGRILLE -1) || (ordTete == 0) || (ordTete == Environnement.TAILLEGRILLE -1))
			{
				System.out.print(gameOver);
				break;
			}
			if ( (absTete == absPast ) && (ordTete == ordPast))
			{
				//Incr�mentation de la longueur du serpent.
				int longSerp = snake.getLongueur();
				longSerp++;
				snake.setLongueur(longSerp);
				
				//Rajouter un �l�ment au tableau de position du serpent.
				
				
				//G�n�rer une nouvelle pastille (dans la variable pastille).
				pastille = map.genererNouvellePastille();
			}
			map = new Environnement(pastille);
			map.placerSerpent(snake);
			System.out.println(map);
			
		}
	}

}
