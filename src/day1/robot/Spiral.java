package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

Robot A = new Robot("batman");

<<<<<<< HEAD
=======
		// 4. Do the following (steps 6-9) 75 times

			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			// 2. Turn the robot 1/3 of 360 degrees to the right
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
>>>>>>> jointheleague/master
	
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
