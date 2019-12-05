package _13_string_conversion;

import javax.swing.JOptionPane;

public class StringConversion {
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("Enter a Number");
		int num = Integer.parseInt(quantity);
		System.out.println(num*2);
	}
}
