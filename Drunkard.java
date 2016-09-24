// Name:
// USC loginid:
// CS 455 PA1
// Fall 2013

import java.util.Random;

import Point.ImPoint;

/**
   Drunkard class
       Represents a "drunkard" doing a random walk on a grid.
*/
public class Drunkard {

    /**
       Creates drunkard with given starting location and distance
       moved in a single step.
       @param startLoc starting location of drunkard
       @param theStepSize size of one step in the random walk
    */
	public ImPoint startLoc = new ImPoint(0, 0);
	public int theStepSize = 0;
	
    public Drunkard(ImPoint startLoc, int theStepSize) {
    	this.startLoc = startLoc;
    	this.theStepSize = theStepSize;
    }


    /**
       Takes a step of length step-size (see constructor) in one of
       the four compass directions.  Changes the current location of the
       drunkard.
    */
    public void takeStep() {
    	Random rand = new Random();
		int number = rand.nextInt(4);
	    if(number == 0) {
	    	moveNorth();
	   	}
	   	else if(number == 1) {
	   		moveSouth();
	   	}
    	else if(number == 2) {
    		moveWest();
	    }
	   	else if(number == 3) {
	   		moveEast();
	   	}
    }

    /**
       gets the current location of the drunkard.
       @return an ImPoint object representing drunkard's current location
    */
    public ImPoint getCurrentLoc() {
    	return this.startLoc;
    }
    
    private void moveNorth() {
    	this.startLoc.translate(0, 5);
    }
    private void moveSouth() {
    	this.startLoc.translate(0, -5);
    }
    private void moveWest() {
    	this.startLoc.translate(-5, 0);
    }
    private void moveEast() {
    	this.startLoc.translate(5, 0);
    }
}