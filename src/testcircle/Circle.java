package testcircle;
import java.util.Random;
/**
 * Circle class.
 */
public class Circle {
	private static double PI = 3.14;
	private double radius;
	/**
	 * constructor
	 * pre: none
	 * post: A Circle object created. Radius initialized to 1.
	 */
	public Circle() {
		//radius = 1;			//default radius
	}
	/** 
	 * Changes the radius of the circle.
	 * pre: none
	 * post: Radius has been changed.
	 */
	public void setRadius(double newRadius) {
	 	radius = newRadius;
	}
	/** 
	 * Calculates the area of the circle.
	 * pre: none
	 * post: The area of the circle has been returned.
	 */
	public double area() {
	 	double circleArea;
	 	
	 	circleArea = PI * radius * radius;
	 	return(circleArea);
	}
	/** 
	 * Returns the radius of the circle.
	 * pre: none
	 * post: The radius of the circle has been returned.
	 */
	public double getRadius() {
	 	return(radius);
	}
        /**
         * Calculates the circumference of the circle.
	 * pre: none
	 * post: The circumference of the circle has been returned. 
         */
        public double circumference(){
            double circleCircumference;
	 	
            circleCircumference = PI * radius * 2;
            return(circleCircumference);
        }
}

