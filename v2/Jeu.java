package V2;

import V2.JeuxDuPendu.JeuDuPendu;
import V2.JeuxDuPendu.JoueurDuPendu;
import V2.ihm.Displayconsole;

/**
 * Created by Ice on 14/02/2017.
 */
public class Jeu {
    public static void main(String[] args) {

        Partie partie = new JeuDuPendu();
        Player player = new JoueurDuPendu();
        Display display = new Displayconsole();

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
