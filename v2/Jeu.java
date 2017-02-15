package v2;

import v2.jeuDuPendu.JeuDuPendu;
import v2.jeuDuPendu.JoueurDuPendu;
import v2.ihm.DisplayConsole;
import v2.ihm.SaisieConsole;

/**
 * Created by Ice on 14/02/2017.
 */
public class Jeu {
    public static void main(String[] args) {

        Partie partie = new JeuDuPendu();
        Player player = new JoueurDuPendu();
        Display display = new DisplayConsole();
        Saisie saisie = new SaisieConsole();

        player.setSaisie(saisie);

        partie.newPlay(player);

        display.say("Bonjour "+ player.getName());

        display.say(partie.getState());

        while(!partie.isFinish()){
            display.say("Indiquez une lettre");
            partie.nextPlay();
            display.say(partie.getState());
        }

    }
}
