package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");


 String AD = JOptionPane.showInputDialog("Enter an adjective.");

 String LI = JOptionPane.showInputDialog("Enter a type of liquid.");

 String BP = JOptionPane.showInputDialog("Enter a body part.");

 String VB = JOptionPane.showInputDialog("Enter a verb (Not ending in "+"ing"+").");

 String PL = JOptionPane.showInputDialog("Enter a place.");

 JOptionPane.showMessageDialog(null, "Piranhas are more "+AD+" during the day, so cross the river at night. Piranhas are attracted to fresh "
		 +LI+" and will most likely take a bite out of your "+BP+" if you "+VB+". \nWhatever you do, if you have an open wound, try to find another way to get back to the "+PL+". Good luck!");
		

	}
}

