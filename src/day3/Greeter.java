package day3;

import javax.swing.JOptionPane;

public class Greeter {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Who are you?");
		String color = JOptionPane.showInputDialog(null, "What's your favorite color?");
		JOptionPane.showMessageDialog(null, "Hello "+name+", I like "+color+" to!");
	}
	
}
