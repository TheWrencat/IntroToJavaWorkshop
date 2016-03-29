package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	

Robot r =new Robot("batman");	
Robot b =new Robot("batman");

	void go() {
r.penDown();
r.setSpeed(10);
r.setPenWidth(5);
b.setSpeed(10);
b.move(300);
b.penDown();
b.setPenWidth(5);

for (int i = 0; i <4; i++) {
	r.setRandomPenColor();
		drawSquare();
		r.turn(90);
}
	}
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			r.move(100);
		r.turn(360/4);
		
		}
	
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
