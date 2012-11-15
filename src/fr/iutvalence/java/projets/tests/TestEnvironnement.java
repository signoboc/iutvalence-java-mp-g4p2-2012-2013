package fr.iutvalence.java.projets.tests;

import fr.iutvalence.java.projets.snake.Environnement;

/**
 * Fonction qui teste l'initialisation du terrain avec la pastille
 * La m�thode ToString dans la classe Environnement symbolise les �l�ments
 * du terrain par des caract�res dans une chaine de caract�res, la fonction
 * de test affiche cette chaine. 
 * @author berardk
 */
public class TestEnvironnement
{
	/**
	 * @param args : Cha�ne de caract�res symbolisant le terrain.
	 */
	public static void main(String[] args)
	{
		Environnement map = new Environnement();
		System.out.println(map);

	}

}
