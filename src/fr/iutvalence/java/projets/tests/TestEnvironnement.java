// FIXME d�placer dans un paquetage diff�rent de celui des classes du jeu  (FIXED)
package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Environnement;

/**
 * Fonction qui teste l'initialisation du terrain avec la pastille
 * La m�thode ToString dans la classe Environnement symbolise les �l�ments
 * du terrain par des caract�res dans une chaine de caract�res, la fonction
 * de test affiche cette chaine. 
 * @author berardk
 */
// FIXME �crire un commentaire (dire ce que l'on veut tester et comment on s'y prend) (FIXED)
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
