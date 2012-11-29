package fr.iutvalence.java.projets.tests;

import java.util.Random;

import fr.iutvalence.java.projets.snake.Case;
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
	 * Désigne la position de la pastille
	 */
	private Coordonnees positionPastille;
	
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
		Coordonnees pastille = new Coordonnees(15,10);
		map = new Environnement();
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
				pastille = genererNouvellePastille();
			}
			System.out.println(map);
			
		}
	}

	
	/**
	 * Méthode pour générer une pastille aux coordonnées aléatoires.
	 * @return : Couple de coordonnées de la nouvelle pastille.
	 */
	public Coordonnees genererNouvellePastille()
	{
		int abs = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		int ord = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		this.positionPastille = new Coordonnees(abs, ord);
		return this.positionPastille;
	}
	
	/**
	 * Méthode qui permet de placer le serpent sur le terrain à l'aide de son tableau de positions.
	 * @param snake : serpent à placer sur la map
	 */
	public Environnement placerSerpent(Serpent snake, Environnement map)
	{
		int i = 1;
		Case[][] grille = map.getGrille();
		int abs;
		int ord;
		int longueur = snake.getLongueur();
		Coordonnees[] position = snake.getPosition();
		grille[position[0].getAbscisse()][position[0].getOrdonnee()] = Case.TETE;
		while (i < longueur )
		{
			abs = position[i].getAbscisse();
			ord = position[i].getOrdonnee();
			grille[abs][ord] = Case.CORPS;
			i++;
		}
		return map;
	}
}
