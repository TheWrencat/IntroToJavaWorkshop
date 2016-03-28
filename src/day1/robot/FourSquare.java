package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	

Robot r =new Robot("batman");	

	void go() {
r.penDown();
r.setSpeed(10);

r.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i <4; i++) {
	r.setRandomPenColor();

			// 7. Set the pen color to random
	

		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
		r.turn(90);
}
	}


	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			r.move(100);
		r.turn(360/4);
		
		}
		r.turn(1);
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
