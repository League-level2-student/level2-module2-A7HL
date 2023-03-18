package _06_overloading;

import javax.swing.JOptionPane;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Enter sumthin");
		String str2 = JOptionPane.showInputDialog("Enter sumthin");
		new LeagueOptionPane().showMessageDialog(str,str2);
	}
}
