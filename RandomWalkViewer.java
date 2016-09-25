import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import Point.ImPoint;



public class RandomWalkViewer {
	public static void main(String args[]) {	
		int steps = stepGenerator();
		Drunkard path = new Drunkard(startPointGenerator(), steps);
		JFrame frame = new JFrame("Random walk viewer frame");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
		for(int i = 0; i < steps; i++) {
			RandomWalkComponent view = new RandomWalkComponent(path);
			frame.add(view);
		}		
	}
	
	private static int stepGenerator() {
		System.out.print("Enter number of steps: ");
		Scanner in = new Scanner(System.in);
		int step = in.nextInt();
		while(step < 0) {
			System.out.println("ERROR: Number entered must be greater than 0");
			System.out.print("Enter number of steps: ");
			step = in.nextInt();
			System.out.print("" + step + "\n");
		}
		in.close();
		return step;
	}
	private static ImPoint startPointGenerator() {
		Random weight = new Random();
		@SuppressWarnings("null")
		int x = weight.nextInt(100) + 100;
		int y = weight.nextInt(100) + 100;
		return new ImPoint(x,y);
	}

}
 