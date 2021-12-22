import Prog1Tools.IOTools;

public class Spiel {

	public static void main(String[] args) {
		
		int geheimzahl, ratenzahl, versuch;
		boolean ratenergebnis;
		
		geheimzahl = (int)(Math.round(Math.random() * 100));
		// System.out.println("Die Geheimzahl ist: " + geheimzahl);
		// System.out.println("***");
		versuch = 0;
		ratenergebnis = false;
		
		
		System.out.println("Hallo! Ich begrüße Sie zum Spiel!");
		System.out.println("---");
		System.out.println("Die Regeln sind einfach: ich denke eine Zahl ab 1 bis 100 aus un Sie sollen sie raten.");
		System.out.println("---");
		System.out.println("Bei jedem Versuch werden Sie erfahren:");
		System.out.println("- ob eingegebene Zahl zu groß oder zu klein ist");
		System.out.println("- wie viel Versuche haben Sie schon unternommen ");
		System.out.println("---");
		System.out.println("Lassen uns starten!");
		System.out.println("---");
		
		while (ratenergebnis != true) {
			
			ratenzahl = IOTools.readInteger("Geben Sie Ihre Zahl ein: "); 
			versuch = versuch + 1;
			
			if (ratenzahl > geheimzahl) {
				
				System.out.println("Das war Versuch #" + versuch);
				System.out.println("Ihre Zahl ist zu groß, versuchen Sie weiter.");
				
			} else if (ratenzahl < geheimzahl) {
				
				System.out.println("Das war Versuch #" + versuch);
				System.out.println("Ihre Zahl ist zu klein, versuchen Sie weiter.");
				
			} else {
				
				ratenergebnis = true;
				System.out.println("Das war Versuch #" + versuch);
				System.out.println("!!! Sie haben gewonnen :) !!!");
				System.out.println("!!! Das Spei ist zu Ende !!!");
				
			}
			
		}
		
	}

}
