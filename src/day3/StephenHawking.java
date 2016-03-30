package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
	public static void main(String[] args) {
		String talk = "";
		for (int i = 0; i < 100; i++) {
			talk = JOptionPane.showInputDialog("Write a sentince please");

			if (talk.equalsIgnoreCase("Steven Hawking")) {
				speak("Hey! Thats me!");
			} else if (talk.equalsIgnoreCase("Tell me a story")||talk.equalsIgnoreCase("Lets play mad libs")) {
				JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");

				String AD = JOptionPane.showInputDialog("Enter an adjective.");

				String LI = JOptionPane.showInputDialog("Enter a type of liquid.");

				String BP = JOptionPane.showInputDialog("Enter a body part.");

				String VB = JOptionPane.showInputDialog("Enter a verb (Not ending in " + "ing" + ").");

				String PL = JOptionPane.showInputDialog("Enter a place.");

				speak("Piranhas are more " + AD + " during the day, so cross the river at night. Piranhas are attracted to fresh " + LI
						+ " and will most likely take a bite out of your " + BP + " if you " + VB
						+ ". \nWhatever you do, if you have an open wound, try to find another way to get back to the " + PL + ". The End!");
			} else {
				speak(talk);
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
