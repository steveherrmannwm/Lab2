/**
 * Steve Herrmann and Max Black
 * Lab2: ThreeDimensionalPoint
 * This class creates a three dimensional point that can then be shifted or rotated.
 * It contains the following methods: getX(), getY(), getz(), shiftX(double amount),
 * shiftY(double amount), shiftZ(double amount), rotateX(double theta), rotateY(double theta),
 * rotateZ(double theta)
 * 1/21/15
 */

package points;

public class ThreeDimensionalPoint {

	//Instance Data
	private double x = 0, y = 0, z = 0;
	
	//Constructors
	public ThreeDimensionalPoint()
	{
		x = 0;
		y = 0;
		z = 0;
	}
	
	public ThreeDimensionalPoint(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Accessors
	
	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getZ()
	{
		return z;
	}
	
	//Methods
	//This method shifts the x point by adding whatever double is set as "amount"
	public double shiftX(double amount)
	{
		
		x = x + amount;
		return x;
	}
	
	//This method shifts the y point by adding whatever double is set as "amount"
	public double shiftY(double amount)
	{
		y = y + amount;
		return y;
	}
	
	//This method shifts the z point by adding whatever double is set as "amount"
	public double shiftZ(double amount)
	{
		z = z + amount;
		return z ;
	}
	
	//This method shifts the ThreeDimensionalPoint around the x-axis
	public void rotateX(double theta)
	{
		y = (y * Math.cos(theta) - z * Math.sin(theta));
		z = (y * Math.sin(theta) + z * Math.cos(theta));
	}
	
	//This method shifts the ThreeDimensionalPoint around the x-axis
	public void rotateY(double theta)
	{
		x = (x * Math.cos(theta) + z * Math.sin(theta));
		z = (-1 * x * Math.sin(theta) + z * Math.cos(theta));
	}
	
	//This method shifts the ThreeDimensionalPoint around the x-axis
	public void rotateZ(double theta)
	{
		x = (x * Math.cos(theta) - y * Math.sin(theta));
		y = (x * Math.sin(theta) + y * Math.cos(theta));
	}
}
