package de.harkci;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine Zeichenkette ein: ");
		Scanner eingabe = new Scanner(System.in);
		String Zeichenkette = eingabe.next();
		System.out.println("Sie haben: " + Zeichenkette + " eingegeben");
		
		int i=0;
		while(i < Zeichenkette.length()) {
			
			if(Zeichenkette.charAt(i) > 96 && Zeichenkette.charAt(i) < 123 ) {
				System.out.print((char) (Zeichenkette.charAt(i) - 32));
			}
			
			else {
				System.out.print((char) (Zeichenkette.charAt(i)));
			}
			i++;
		}
	}

}