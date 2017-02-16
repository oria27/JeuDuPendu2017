package v2;

import v2.jeuDuPendu.JeuDuPendu;
import v2.jeuDuPendu.JoueurDuPendu;
import v2.wordsGenerators.WGArray;
import v2.wordsGenerators.WGOnline;
import v2.wordsGenerators.WGUserInput;
import v2.ihm.DisplayConsole;
import v2.ihm.SaisieConsole;

/**
 * Created by Ice on 14/02/2017.
 */
public class Jeu {

	public static void main(String[] args) {

		/*
		 * Initialisation
		 */

		Display display = new DisplayConsole();

		Saisie saisie = new SaisieConsole();

		Player player = new JoueurDuPendu();
		player.setSaisie(saisie);

		// WordsGenerator wg = new WGOnline();
		WordsGenerator wg = new WGArray();
		// WordsGenerator wg = new WGUserInput(saisie);

		Partie partie = new JeuDuPendu();
		partie.setWordGenerator(wg);

		/*
		 * Le jeu commence
		 */

		player.askName();

		boolean gameFinished = false;
		while (!gameFinished) {
			partie.newPlay(player);

			display.say("Bonjour " + player.getName());

			display.say(partie.getState());

			while (!partie.isFinish()) {
				display.say("Indiquez une lettre");
				partie.nextPlay();
				display.say(partie.getState());
			}

			if (saisie.lireChaine("Une autre partie ?") != "oui") {
				gameFinished = true;
			}
		}

	}
}
