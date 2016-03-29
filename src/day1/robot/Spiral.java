package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

Robot A = new Robot("batman");

	
			// 9. Set the pen width to i

A.penDown();

A.setSpeed(10);
for (int i = 0; i < 2000; i++)
{
	A.turn(360/4);
	A.move(5*i);
	A.setRandomPenColor();
	A.setPenWidth(i*5);
	
}

	}
}
