package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
int magic = new Random().nextInt(4);
System.out.println(magic);
JOptionPane.showInputDialog("Ask me a question...");
if (magic == 0) {
	JOptionPane.showMessageDialog(null, "No");
}
if (magic == 1) {
	JOptionPane.showMessageDialog(null, "Yes");
}
if (magic == 2) {
	JOptionPane.showMessageDialog(null, "You should ask Google.");
}
if (magic == 3) {
JOptionPane.showMessageDialog(null, "You will find out when its time.");
}
}
}
