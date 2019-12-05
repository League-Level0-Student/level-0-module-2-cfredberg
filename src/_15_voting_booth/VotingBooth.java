package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int intAge = Integer.parseInt(age);
		if (intAge > 18) {
			JOptionPane.showInputDialog("Who would you like the next president to be?");
		}else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}
}
