package fr.iutvalence.java.projets.snake;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;

/**
 * Classe : Partie Classe principale de l'application : G�re la gestion des autres classes, g�n�re la partie de jeu.
 * 
 * @author berardk
 */
public class Partie implements Controle
{
	/**
	 * D�signe la position de la pastille.
	 */
	private Coordonnees positionPastille;
	
	/**
	 * Interface d'affichage.
	 */
	private Aff a;
	
	/**
	 * Interface de gestion des touches.
	 */
	//private Controle c;
	
	/**
	 * D�signe le nom du joueur.
	 */
	private String nomJoueur;
	
	/**
	 * D�signe le serpent de la partie.
	 */
	private Serpent snake;
	
	/**
	 * D�signe le terrain de jeu.
	 */
	private Environnement map;

	/**
	 * D�signe le score du joueur.
	 */
	private int scoreJoueur;
	
	/**
	 * Message affich� en fin de partie.
	 */
	private static String gameOver = "GAME OVER !\n";
	
	/**
	 * Constructeur de la partie.
	 * @param a : Interface d'affichage.
	 */	
	public Partie(Aff a)
	{
		super();
		
		// Initialisation de la partie : On met un serpent sur une map.
		this.map = new Environnement();
		this.snake = new Serpent(10);
		this.scoreJoueur = 0;
		this.nomJoueur = "Joueur";
		this.a = a;
		//this.c = c;
		placerSerpent(this.snake, this.map);
		
		//Gestion et placement de la pastille :
		Coordonnees pastille = genererNouvellePastille();
		placerPastille(pastille, this.map);
		
	}
	
	public int getScoreJoueur()
	{
		return scoreJoueur;
	}


	public void setScoreJoueur(int scoreJoueur)
	{
		this.scoreJoueur = scoreJoueur;
	}
	
	/**
	 * @param pastille : pastille que l'on veut placer sur la map.
	 * @param map : map dans laquelle on veut placer la pastille.
	 */
	private void placerPastille(Coordonnees pastille, Environnement map)
	{
		try
		{
			map.setCaseAt(pastille, Case.PASTILLE);
		}
		catch (CoordonneesInvalideException e)
		{
			// Nothing!
		}
	}
	
	/**
	 * M�thode qui permet de placer le serpent sur le terrain � l'aide de son tableau de positions.
	 * @param snake : serpent � placer sur la map
	 * @param map : map sur laquelle on veut placer le serpent
	 */
	private void placerSerpent(Serpent snake, Environnement map) 
	{
		int i = 1;
		int longueur = snake.getLongueur();
		Coordonnees[] position = snake.getPosition();
		try
		{
			map.setCaseAt(position[0], Case.TETE);
		}
		catch (CoordonneesInvalideException e)
		{
			// ca n'arrive pas !
		}
		while (i < longueur )
		{
			try
			{
				map.setCaseAt(position[i], Case.CORPS);
			}
			catch (CoordonneesInvalideException e)
			{
				// doesn't happen
			}
			i++;
		}
	}
	
	/**
	 * M�thode pour g�n�rer une pastille aux coordonn�es al�atoires.
	 * @return : Couple de coordonn�es de la nouvelle pastille.
	 */
	private Coordonnees genererNouvellePastille()
	{
		int abs = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		int ord = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		this.positionPastille = new Coordonnees(abs, ord);
		return this.positionPastille;
	}
	
	
	// GESTION DU CLAVIER
	/**
	 * M�thode qui va g�rer les �venements du clavier
	 * @param e : Evenement, touche appuy�e.
	 */
	public void orienterSerpent ( Direction dir)
	{
	    	// touche fl�che droite
	    if ((this.snake.getDirection() == Direction.HAUT) || (this.snake.getDirection() == Direction.BAS))
	    	this.snake.OrienterDroite();
	    else if ((this.snake.getDirection() == Direction.HAUT) || (this.snake.getDirection() == Direction.BAS))
	    	this.snake.OrienterGauche();
	    else if ((this.snake.getDirection() == Direction.GAUCHE) || (this.snake.getDirection() == Direction.DROITE))
	    	this.snake.OrienterHaut();
	    else if ((this.snake.getDirection() == Direction.GAUCHE) || (this.snake.getDirection() == Direction.DROITE))
	    	this.snake.OrienterBas();
	}


	/**
	 * M�thode qui g�re le d�roulement de la partie.
	 * @throws InterruptedException : G�re l'exception li�e au sleep.
	 */
	public void demarrer() throws InterruptedException
	{
		Case contenu = Case.VIDE;
		Coordonnees pastille;
		int score = 0;
		
		// Positions du serpent avant et apr�s d�placement
		Coordonnees[] positionSerpent;
		Coordonnees[] positionSerpentpre;
		
		// Abscisse et ordonn�es utilis�es pour l'allongement du serpent.
		int absqueue, ordqueue;
		
		int longueurSerpent = 0;
		int longueurSerpentpre = 0;
		int i;
		while(true)
		{
			Thread.sleep(200);
			
			// On sauvegarde des �l�ments de l'ancien serpent qui serviront � l'allongement
			// du serpent et � la r�initialisation du terrain:
			positionSerpentpre = this.snake.getPosition();
			longueurSerpent = this.snake.getLongueur();
			longueurSerpentpre = this.snake.getLongueur();
			absqueue = positionSerpentpre[longueurSerpent - 1].getAbscisse();
			ordqueue = positionSerpentpre[longueurSerpent - 1].getOrdonnee();
			
			// R�initialisation du tableau : On efface le serpent pr�c�dent.			
						i=0;
						while (i < longueurSerpentpre)
						{
							try
							{
								this.map.setCaseAt(positionSerpentpre[i], Case.VIDE);
							}
							catch (CoordonneesInvalideException e)
							{
								// Nothing !
							}
							i++;
						}
			
			// Apr�s initialisation, on d�place le serpent.
			this.snake.orientationAlea();
			this.snake.DeplacerSerpent();
			positionSerpent = this.snake.getPosition();
			try
			{
				contenu = this.map.getCaseAt(positionSerpent[0]);
			}
			catch (CoordonneesInvalideException e)
			{
				// Nothing !
			}
			
			//------------- GESTION DES COLLISIONS --------------//
			
			// Comparaison de coordonn�es de la t�te et des murs:
			if (contenu == Case.MUR)
			{
				System.out.print(gameOver);
				break;
			}
			
			// Comparaison de coordonn�es de la t�te et du corps:
			i=1;
			while ( i < longueurSerpent )
			{
				if (positionSerpent[0] == positionSerpentpre[i])
				{
					System.out.print(gameOver);
					break;
				}
				i++;
			}
			
			// Comparaison de coordonn�es de la t�te et de la pastille:
			if (contenu == Case.PASTILLE)
			{
				//Incr�mentation de la longueur du serpent.
				longueurSerpent++;
				this.snake.setLongueur(longueurSerpent);
				
				//Rajouter un �l�ment au tableau de position du serpent.
				
				positionSerpent[longueurSerpent - 1] = new Coordonnees(absqueue,ordqueue);
				
				this.snake.setPosition(positionSerpent);
				
				//G�n�rer une nouvelle pastille (dans la variable pastille).
				pastille = genererNouvellePastille();
				
				//MAJ map avec la nouvelle pastille.
				this.placerPastille(pastille, this.map);
				
				//Incr�mentation du score
				score = getScoreJoueur();
				score++;
				this.setScoreJoueur(score);
				
			}
						
			// Placement du serpent dans la map apr�s d�placement :
			longueurSerpent = this.snake.getLongueur();
			positionSerpent = this.snake.getPosition();
			i = 1;
			
			try
			{
				this.map.setCaseAt(positionSerpent[0], Case.TETE);
			}
			catch (CoordonneesInvalideException e)
			{
				// Nothing !
			}
			
			while (i < longueurSerpent)
			{
				try
				{
					this.map.setCaseAt(positionSerpent[i], Case.CORPS);
				}
				catch (CoordonneesInvalideException e)
				{
					// Nothing !
				}
				i++;
			}
			this.a.afficheMap(this.map);
			this.a.afficheJoueurEtScore(this.nomJoueur, this.scoreJoueur);
		}
		
	}

	
	// FIXME (autres) attributs, constructeurs, m�thodes ?
}