package fr.iutvalence.java.projets.snake;

import java.awt.event.*;
import fr.iutvalence.java.projets.snake.Direction;

import javax.swing.JFrame;

/**
 * Classe qui gère les évenements du clavier.
 * @author berardk
 *
 */
public class GestionClavier implements KeyListener
{
	
	public void gestionTouches()
	{
		JFrame frame = new JFrame();
		frame.setTitle("Snake");									// Titre de la fenêtre.
		frame.setSize(100, 200);									// Taille de la fenêtre.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
		frame.setVisible(true);

		frame.addKeyListener(this);
	}
	public void keyTyped(KeyEvent e)
	{
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
	    {
			Controle.orienterSerpent(Direction.DROITE);
	    }
	    else if (e.getKeyCode() == KeyEvent.VK_LEFT)
	    {
	    	return Direction.GAUCHE;
	    }
	    else if (e.getKeyCode() == KeyEvent.VK_UP)
	    {
	    	return Direction.HAUT;
	    }
	    else //if (e.getKeyCode() == KeyEvent.VK_DOWN)
	    {
	    	return Direction.BAS;
	    }
	}

	public void keyReleased(KeyEvent e)
	{
		
	}
}
