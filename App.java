
import java.awt.*; 
import javax.swing.*;

public class App {

	public static void main(String[] args) {
        String ccnum = JOptionPane.showInputDialog(null, "Credit Card Number");
		validateCreditCardNumber(ccnum);
	}

	private static void validateCreditCardNumber(String str) {

		int[] ints = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ints[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		for (int i = ints.length - 2; i >= 0; i = i - 2) {
			int j = ints[i];
			j = j * 2;
			if (j > 9) {
			j = j % 10 + 1;
			}
			ints[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
		}
		if (sum % 10 == 0) {
			String e = str + " is a valid credit card number";
            JFrame frame = new JFrame("Credit Card Validator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel textLabel = new JLabel(e, SwingConstants.CENTER);
            textLabel.setPreferredSize(new Dimension(300, 100));
            frame.getContentPane().add(textLabel, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
		} else {
			String e = str + " is an invalid credit card number";
            JFrame frame = new JFrame("Credit Card Validator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel textLabel = new JLabel(e, SwingConstants.CENTER);
            textLabel.setPreferredSize(new Dimension(300, 100));
            frame.getContentPane().add(textLabel, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
		}
	}
}
