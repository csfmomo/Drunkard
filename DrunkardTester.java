import Point.ImPoint;


public class DrunkardTester {
    public static void main(String[] args) {
    	ImPoint point1 = new ImPoint (200,200);
    	int stepSize1 = 200;
    	drunkardTest(point1, stepSize1);
    }
		

    private static void drunkardTest(ImPoint loc, int stepSize) {
    	Drunkard drunkardOne = new Drunkard(loc, stepSize);
    	System.out.println("first drunkard start from " + drunkardOne.startLoc.getX() + " " + drunkardOne.startLoc.getY());
    }
}
