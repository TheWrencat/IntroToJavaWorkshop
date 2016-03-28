package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2 = new Robot("batman");
Robot C =new Robot("mini");

r2d2.setSpeed(5);
r2d2.penDown();
r2d2.setPenColor(Color.pink);
C.setSpeed(5);
C.setPenColor(Color.pink);
C.penDown();

C.turn(-90);
C.move(300);

for (int i = 0; i < 8; i++)
{
	r2d2.turn(360/8);
	r2d2.move(100);
}

for (int i = 0; i < 3; i++)
{
	C.turn(360/3);
	C.move(100);
}
		
	}
}
