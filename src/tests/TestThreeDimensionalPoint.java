/**
 * Steve Herrmann and Max Black
 * Lab2: TestThreeDimensionalPoint
 * This class tests the ThreeDimensionalPoint methods.
 * 1/21/15
 */

package tests;

import static org.junit.Assert.*;
import points.ThreeDimensionalPoint;
import org.junit.Test;

public class TestThreeDimensionalPoint {

	@Test
	public void testAccessors(){
		ThreeDimensionalPoint p1 = new ThreeDimensionalPoint(1,1,1);
		
		assertEquals(1,p1.getX(),.001);
		assertEquals(1,p1.getY(),.001);
		assertEquals(1,p1.getZ(),.001);
	}
	
	@Test
	public void testShift() {
		ThreeDimensionalPoint p1 = new ThreeDimensionalPoint(1,1,1);
		
		
		assertEquals(3,p1.shiftX(2),.001);
		assertEquals(3,p1.shiftY(2),.001);
		assertEquals(3,p1.shiftZ(2),.001);
	}
	
	@Test
	public void testRotate()
	{
		ThreeDimensionalPoint p1 = new ThreeDimensionalPoint(1,1,1);
		ThreeDimensionalPoint p2 = new ThreeDimensionalPoint(1,1,1);
		ThreeDimensionalPoint p3 = new ThreeDimensionalPoint(1,1,1);
		
		p1.rotateX(Math.PI);
		assertEquals(1, p1.getX(), .001);
		assertEquals(-1, p1.getY(), .001);
		assertEquals(-1, p1.getZ(), .001);
		
		p2.rotateY(Math.PI);
		assertEquals(-1, p2.getX(), .001);
		assertEquals(1, p2.getY(), .001);
		assertEquals(-1, p2.getZ(), .001);
		
		p3.rotateZ(Math.PI);
		assertEquals(-1, p3.getX(), .001);
		assertEquals(-1, p3.getY(), .001);
		assertEquals(1, p3.getZ(), .001);
		
	}


}
