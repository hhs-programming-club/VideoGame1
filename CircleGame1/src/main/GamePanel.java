package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener, MouseListener
{
	/**
	 * Updates the things drawn onto the screen.
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		/*
		 * scale the window from default dimensions to current dimensions
		 * this allows us to draw using fixed coordinates for the rest of the method
		 */
		((Graphics2D) g).scale((double)getWidth()/Main.DEFAULT_W, (double)getHeight()/Main.DEFAULT_H);
		//set the drawing color to red
		g.setColor(Color.RED);
		
		/*
		 * fills an oval using the current color (in this case red)
		 * the bounding rectangle of the oval will have top left corner (350,250)
		 * and has length and width 100 (meaning the oval is actually a circle)
		 */
		g.fillOval(350, 250, 100, 100);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * The run method is an infinite loop which updates the screen every 16 ms (about 60 fps).
	 */
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(16); //pause for 16 ms
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			repaint(); //update screen
		}
	}
}
