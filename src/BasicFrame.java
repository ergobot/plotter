import java.awt.*;
import javax.swing.*;

public class BasicFrame extends JFrame {

	public Point center;
	public LinesComponent MyLines;
	
	
	
	// Create a constructor method
	public BasicFrame(int width, int height) {
		// All we do is call JFrame's constructor.
		// We don't need anything special for this
		// program.
		super();
		this.setSize(width, height);
		center = new Point(width / 2, height / 2);
		MyLines = new LinesComponent();
	}

	// The following methods are instance methods.
	/*
	 * Create a paint() method to override the one in JFrame. This is where the
	 * drawing happens. We don't have to call it in our program, it gets called
	 * automatically whenever the frame needs to be redrawn, like when it it
	 * made visible or moved or whatever.
	 */
	public void paint(Graphics g) {
	    
		int angle = 0;
		for(int i = 0; i< 360; i++)
		{
			Point newPoint = AngleLine(center.x,center.y,angle,center.x);
			g.drawLine(newPoint.x, newPoint.y, center.x, center.y);
			angle++;
		}
		
		
		//g.drawLine(10, 10, 150, 150); // Draw a line from (10,10) to (150,150)
//		Point newPoint = AngleLine(center.x,center.y,15,100);
//		g.drawLine(newPoint.x, newPoint.y, center.x, center.y);
	}

	public Point AngleLine(int oldX, int oldY, int angle, double distance) {
		double d = distance;
		
		Point oldPoint = new Point(oldX,oldY);//(canvasWidth / 2, canvasHeight / 2);
		Point point2 = new Point();

		point2.x = (int) (oldPoint.x + d * Math.cos(angle));
		point2.y = (int) (oldPoint.y + d * Math.sin(angle));
		
		return point2;
	}
}