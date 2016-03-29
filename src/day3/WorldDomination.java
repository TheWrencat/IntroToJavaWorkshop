package day3;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class WorldDomination {
	public static void main(String[] args) {

String code = JOptionPane.showInputDialog("Do you know how to code?");

if (code.equalsIgnoreCase("Yes")) {
	System.out.println("You will rule the world.");
}
else {
	System.out.println("Good luck washing dishes!");
}

String day = JOptionPane.showInputDialog("What day is it?");
if (day.equalsIgnoreCase("Tuesday")) {
	System.out.println("Happy ");
}
else {
	System.out.println("Its ");
}
System.out.println("Tuesday!");

//String age

	}
}

