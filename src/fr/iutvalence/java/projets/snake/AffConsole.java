package fr.iutvalence.java.projets.snake;


/**
 * Classe qui gère l'affichage du jeu sur la console.
 * @author berardk
 */
public class AffConsole implements Aff
{

	public void afficheMap ( Environnement map)
	{
		System.out.println(map);
	}
	
	public void afficheJoueurEtScore ( String nom, int score)
	{
		System.out.println ( "Nom : " + nom + " Score : " + score );
	}
}
