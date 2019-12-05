package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("What is your height in inches?");
		int intHeight = Integer.parseInt(height);
		if (intHeight > 48) {
			JOptionPane.showMessageDialog(null, "Move Along");
		}else {
			JOptionPane.showMessageDialog(null, "You Need To Grow a Little Before You Can Ride");
		}
	}
}
