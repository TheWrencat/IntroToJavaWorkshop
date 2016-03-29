package day3;

import javax.swing.JOptionPane;

public class Creeper {
	public static void main(String[] args) {
String name = JOptionPane.showInputDialog("Whats your name?");	
String home = JOptionPane.showInputDialog("Where do you live?");
String where = JOptionPane.showInputDialog("Where are you?");
JOptionPane.showMessageDialog(null, "Hello "+name+", you"
		+ " shouldn't have told me all that! I know know you live at "+home+" and are at "+where+
		" right now!");


	}
	
	
}
