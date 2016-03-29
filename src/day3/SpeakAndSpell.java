package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
speak("Spell individually.");
String answer1 = JOptionPane.showInputDialog("Write your answer here.");
if (answer1.equalsIgnoreCase("individually")) {
	speak("Correct, Good job!");
}
else {
	speak("Incorrect!");
}
speak("Spell Monopoly.");
String answer2 = JOptionPane.showInputDialog("Write your answer here.");
if (answer2.equalsIgnoreCase("monopoly")) {
	speak("Correct, Good job!");
}
else {
	speak("Incorrect!");
}
speak("Spell Cholesterol.");
String answer3 = JOptionPane.showInputDialog("Write your answer here.");
if (answer3.equalsIgnoreCase("Cholesterol")) {
	speak("Correct, Good job!");
}
else {
	speak("Incorrect!");
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






















