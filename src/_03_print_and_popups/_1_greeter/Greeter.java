package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		String input= JOptionPane.showInputDialog("what is your name?");	
		JOptionPane.showMessageDialog(null,"Hello "+ input);
		
		
		String bestFood= JOptionPane.showInputDialog("what is your favorite food?");
		JOptionPane.showMessageDialog(null, bestFood +" is my favorite food too");
		
		
		String bestShow= JOptionPane.showInputDialog("what is your favorite show?");
		JOptionPane.showMessageDialog(null, bestShow +" that's cool");
	}
		
}
