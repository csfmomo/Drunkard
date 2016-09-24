import java.awt.Graphics;

import javax.swing.JComponent;

public class RandomWalkComponent extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Drunkard walk;
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//	}
	
	public RandomWalkComponent(Drunkard walk) {
		this.walk = walk;
		
//		step = walk.theStepSize;
//		for(int i = 0; i < step; i++) {
//			origX = walk.getCurrentLoc().getX();
//			origY = walk.getCurrentLoc().getY();
//			walk.takeStep();
//			postX = walk.getCurrentLoc().getX();
//			postY = walk.getCurrentLoc().getY();
//			paintComponent(g);
//		}
	}
	
	public void paintComponent(Graphics g) {
//			super.paintComponent;
		for(int i = 0; i < walk.theStepSize; i++) {
			int origX = walk.getCurrentLoc().getX();
			int origY = walk.getCurrentLoc().getY();
			walk.takeStep();
			int postX = walk.getCurrentLoc().getX();
			int postY = walk.getCurrentLoc().getY();
			g.drawLine(origX, origY, postX, postY);
		}
			
	}
}
