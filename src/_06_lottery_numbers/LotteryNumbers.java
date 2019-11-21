package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random gen = new Random();
		
		int i1 = gen.nextInt(50);
		int i2 = gen.nextInt(50);
		int i3 = gen.nextInt(50);
		int i4 = gen.nextInt(50);
		int i5 = gen.nextInt(50);
		
		JOptionPane.showMessageDialog(null, i1 + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5, "Lottery Ticket #", JOptionPane.ERROR_MESSAGE);
	}
}
