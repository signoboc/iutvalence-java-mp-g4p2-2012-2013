// FIXME déplacer dans un paquetage différent de celui des classes du jeu  (FIXED)
package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Environnement;

/**
 * Fonction qui teste l'initialisation du terrain avec la pastille
 * La méthode ToString dans la classe Environnement symbolise les éléments
 * du terrain par des caractères dans une chaine de caractères, la fonction
 * de test affiche cette chaine. 
 * @author berardk
 */
// FIXME écrire un commentaire (dire ce que l'on veut tester et comment on s'y prend) (FIXED)
public class TestEnvironnement
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Environnement map = new Environnement();
		System.out.println(map);

	}

}
