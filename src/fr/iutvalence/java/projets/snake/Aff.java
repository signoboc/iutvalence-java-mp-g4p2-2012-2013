package fr.iutvalence.java.projets.snake;

import fr.iutvalence.java.projets.snake.Environnement;


/**
 * Interface pour l'affichage du jeu
 * @author berardk
 */
public interface Aff
{
	/**
	 * Signature de la m�thode d'affichage de la map.
	 * @param map : Terrain � afficher.
	 */
	public void afficheMap ( Environnement map);
	
	/**
	 * Signature de la m�thode d'affichage du nom du joueur et du score
	 * @param nom : Nom du joueur.
	 * @param score : Score du joueur.
	 */
	public void afficheJoueurEtScore ( String nom, int score);
}
