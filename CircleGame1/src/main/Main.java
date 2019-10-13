package main;

import javax.swing.*;

/*
 * PART 1 GOAL: This is an introduction to how to make a game in Java Swing. This part
 * is a tutorial on how to get a window set up, and draw our first shape! There is no
 * coding in this part, but make sure you understand what each line of code is doing
 * before moving on to the next stage.
 */
public class Main
{
	//default width and height
	public static final int DEFAULT_W = 800, DEFAULT_H = 600;
	
	public static void main(String[] args)
	{
		//JFrame represents the entire window, we title the window "Circle Game"
		JFrame w = new JFrame("Circle Game");
		/*
		 * sets the window to start at 100, 100 relative to the computer screen
		 * and to have the default dimensions
		 */
		w.setBounds(100, 100, DEFAULT_W, DEFAULT_H);
		//specifies that the program should terminate (exit) when the window is closed
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//initialize a game panel, the area where we draw the game
		GamePanel game = new GamePanel();
		//add the drawing area to the window so we can see it
		w.add(game);
		/*
		 * when the window as a whole has the focus, it can detect key presses. we notify
		 * the game panel when a key is pressed to see what action the program should take
		 * (as specified by the GamePanel's implementation of the KeyListener methods)
		 */
		w.addKeyListener(game);
		/*
		 * the game panel itself detects the mouse inputs, so this tells the game to refer to
		 * its own methods to handle mouse inputs.
		 */
		game.addMouseListener(game);
		
		//self explanatory settings of the window
		w.setResizable(true);
		w.setVisible(true);
		
		/*
		 * Starts the game loop. The panel will update itself every 16 milliseconds,
		 * and also handle all the game mechanics.
		 */
		game.run();
	}
}
