package no.hvl.dat100.unntak.eksempler;

import javax.swing.JOptionPane;

public class Hastighet {

	public static void main(String[] args) {

		String kmstr = JOptionPane.showInputDialog("Avstand i kilometer");
		int km = Integer.parseInt(kmstr); 

		String tmstr = JOptionPane.showInputDialog("Tid i timer");
		int tm = Integer.parseInt(tmstr); 
		
		double hastighet = (double)km/tm;
		
		System.out.println("Hastighet: " + hastighet);
		
	}
}