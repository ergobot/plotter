import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Scanner;

import javax.swing.JFrame;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
//		boolean test = false;
//		int val = test? 1 : 0;
//		System.out.println(val);
		// TODO Auto-generated method stub
		// create an identifier named 'window' and
	    // apply it to a new BasicFrame object
	    // created using our constructor, above.
	    BasicFrame frame = new BasicFrame(400,400);

	    // Use the setSize method that our BasicFrame
	    // object inherited to make the frame
	    // 200 pixels wide and high.
//	    frame.setSize(200,200);

	    // Make the window show on the screen.
	    frame.setVisible(true);
	    
//	    frame.AngleLine(200, 200, 15, 50);
	    
	    String quit = "";
	    while(!quit.equalsIgnoreCase("y"))
	    {
	    	System.out.println("Add a new point");
	    	System.out.println("What is the x of the current line");
	    	int oldX = keyboard.nextInt();
	    	
	    	System.out.println("What is the y of the current line");
	    	int oldY = keyboard.nextInt();
	    	
	    	System.out.println("What were the degrees that you were traveling");
	    	int previousAngle = keyboard.nextInt();
	    	
	    	System.out.println("How many units did you travel?");
	    	int distanceTraveled = keyboard.nextInt();
	    
	    	Point newPoint = frame.AngleLine(oldX, oldY, previousAngle, distanceTraveled);
	    	
	    	frame.MyLines.addLine(oldX, oldY, newPoint.x, newPoint.y, Color.BLUE);
	    	
	    	System.out.println("Would you like to quit? (y/n)");
	    	quit = keyboard.nextLine();
	    }

	    
	}



	
	
}
